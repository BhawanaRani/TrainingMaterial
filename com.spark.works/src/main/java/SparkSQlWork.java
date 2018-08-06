import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet.COL;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions.*;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import com.training.commons.SparkConnections;

public class SparkSQlWork {
public static void main(String[] args) {
	Logger.getLogger("org").setLevel(Level.ERROR);
	//optional
	Logger.getLogger("akka").setLevel(Level.ERROR);
  
	
	JavaSparkContext sparkContext=SparkConnections.getContext();
	SparkSession spSession=SparkConnections.getSession();
	
	
	Dataset<Row> empDataFile=spSession.read().json("./data/customerData.json");
	empDataFile.show();
	empDataFile.printSchema();
	
	
	
	//data queries
	
	System.out.println("select Demo");
	empDataFile.select(org.apache.spark.sql.functions.col("name"),org.apache.spark.sql.functions.col("salary")).show();
	
	
	//data queries on selection (condition)
	System.out.println("select Demo with condition");
	//empDataFile.filter(col("gender")).equalTo("male")).show();
	
	//System.out.println();
	
	
	//group by dept id ,average salry ,max age
	
	Dataset<Row> summaryData=empDataFile.groupBy(org.apache.spark.sql.functions.col("deptid"))
			                  .agg(org.apache.spark.sql.functions.avg((empDataFile.col("salary"))),org.apache.spark.sql.functions.max(empDataFile.col("age")));
			      
	
	summaryData.show();
	
	
	
	
	////try with bean classes/////
	
	
	
	
	Department dept1=new Department(100,"Development");
	
	Department dept2=new Department(200,"Testing");
	
	
	List<Department> deptList=new ArrayList<Department>();
	
	deptList.add(dept1);
	deptList.add(dept2);
	
	Dataset<Row> deptDataField=spSession.createDataFrame(deptList, Department.class);
	
	System.out.println("Department contents are.......");
	deptDataField.show();
	
	Dataset<Row> empDeptJoin=empDataFile.join(deptDataField,org.apache.spark.sql.functions.col("deptid").equalTo(org.apache.spark.sql.functions.col("departmentId")));
	empDeptJoin.show();
	
	
	empDataFile.filter(org.apache.spark.sql.functions.col("age").gt(30)).join(deptDataField,org.apache.spark.sql.functions.col("deptid")
			.equalTo(org.apache.spark.sql.functions.col("departmentId"))).groupBy(org.apache.spark.sql.functions.col("deptid"))
	.agg(org.apache.spark.sql.functions.avg(empDataFile.col("salary")),
			org.apache.spark.sql.functions.max(empDataFile.col("age"))).show();
	
	
	
	Dataset<Row> autoData=spSession.read().option("header", "true").csv("./data/auto-dataNew");
	
	autoData.show(5);
	
	
	
	//creating object with row//
	Row row1=RowFactory.create(1,"India","Bangaluru");
	Row row2=RowFactory.create(2,"USA","Restron");
	Row row3=RowFactory.create(3,"UK","SteevenScreek");
	
	
	
	List<Row> rList=new ArrayList<Row>();
	
	rList.add(row1);
	rList.add(row2);
	rList.add(row3);
	
	
	
	JavaRDD<Row> rowRDD=sparkContext.parallelize(rList);
	
	StructType schema=DataTypes.createStructType(new StructField[] 
			{DataTypes.createStructField("id",DataTypes.IntegerType,false),
				DataTypes.createStructField("country",DataTypes.StringType,false),
				DataTypes.createStructField("city",DataTypes.StringType,false)
			});
	
	
	
	Dataset<Row> tempDataField=spSession.createDataFrame(rowRDD, schema);
	tempDataField.show();
	

	
	//working with  csv data,with sql statements
	//provide the data is kept in table like format
	//presistence will b only till end of prgrm
	
	autoData.createOrReplaceTempView("autos");//csv file auto data ......creating temp view autos
	System.out.println("Temp Table content");
	
	
	System.out.println("showing all the fields with hp greater than 200");
	//spSession.sql("select * from autos where HP>200").show();
	
	
	//to find make ,maximum RPM from autos group by make
	System.out.println("===========to find make,maximum from autos=========");
	//spSession.sql("select make,max(rpm) from autos group by make order by 2").show();
	
	//convert dataframe to JavaRDD
	JavaRDD autoRdd=autoData.rdd().toJavaRDD();
	
	
	//reading the data from mysql db
	
	//db (db) table(employee
	
	
	Map<String,String> jdbcConnection=new HashMap<String,String>();
	
	jdbcConnection.put("url", "jdbc:mysql://localhost:3306/myDatabase");
	jdbcConnection.put("driver", "com.mysql.jdbc.Driver");
	jdbcConnection.put("dbtable", "Employee");
	jdbcConnection.put("user", "root");
	jdbcConnection.put("password", "Root@123");
	
	
	
	System.out.println("create a db from db table (Employee)");
	
	Dataset<Row> sqlDataFields=spSession.read().format("jdbc").options(jdbcConnection).load();
	
	
	sqlDataFields.show();
}
}
