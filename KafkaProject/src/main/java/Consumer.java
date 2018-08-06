import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import kafka.utils.ShutdownableThread;

public class Consumer extends ShutdownableThread{

	
	private KafkaConsumer<Integer, String> consumer;
	private String topic;
	public Consumer(String name, boolean isInterruptible) {
		super(name, isInterruptible);
		
		Properties properties=new Properties();
		properties.setProperty("bootstrap.servers", KafkaProperties.KAFKA_SERVER_URL+":"
				+KafkaProperties.KAFKA_SERVER_PORT);
		
		
		properties.setProperty("key.deserializer",IntegerDeserializer.class.getName());
		properties.setProperty("value.deserializer",StringDeserializer.class.getName());
		
		
		properties.setProperty("group.id", "MyGroup");
		properties.setProperty("session.timeout.ms", "10000000");
		
		
		consumer=new KafkaConsumer<Integer, String>(properties);
	}

	@Override
	public void doWork() {
		consumer.subscribe(Collections.singleton(this.topic));
		ConsumerRecords<Integer,String> records=consumer.poll(1000);
		
		
		
		for(ConsumerRecord<Integer, String> record:records)
		{
			System.out.println("Recived Message Key ->"+
		            record.key()+"Message "+
					record.value()+" @offset "+record.offset()
					+"partition:"+
					record.partition());
		}
	}

}
