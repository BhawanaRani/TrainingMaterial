import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;



public class Producer extends Thread {
private final KafkaProducer<Integer, String> producer;
private final String topic;
private Boolean isAsync;
private String name;
private boolean interrupt;




public Producer (String topic,Boolean isAsync, String name)
{
	this.topic=topic;
	this.isAsync=isAsync;
	this.name=name;
	
	Properties properties=new Properties();
	properties.setProperty("bootstrap.servers", KafkaProperties.KAFKA_SERVER_URL+":"
			+KafkaProperties.KAFKA_SERVER_PORT);
	
	
	properties.setProperty("client.id",KafkaProperties.CLIENT_ID );
	properties.setProperty("key.serializer",IntegerSerializer.class.getName() );
	
	//properties.setProperty("value.serializer",IntegerSerializer.class.getName() )
	properties.setProperty("value.serializer",StringSerializer.class.getName() );
	
	
	producer=new KafkaProducer<Integer, String>(properties);
	
	
	
	
}



@Override
public void run(){
	int messageNo=1;
	
	while(interrupt) {
		String messageString="message from Producer"+
	this.name+"Count:"+messageNo;
		
		
		
		if(isAsync)
		{
			ProducerRecord<Integer, String> producerRecord=new ProducerRecord<Integer,String>(this.topic,messageNo,messageString);
			long startTime=System.currentTimeMillis();
			producer.send(producerRecord,new ProducerMessageCallable(startTime, messageNo, messageString));
		}
		else
		{
			ProducerRecord<Integer, String> producerRecord=new ProducerRecord<Integer,String>(this.topic,messageNo,messageString);
			try {
				producer.send(producerRecord).get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	  messageNo++;
	}
}

public void setInterrupt(boolean interrupt) {
	this.interrupt = interrupt;
}



}
