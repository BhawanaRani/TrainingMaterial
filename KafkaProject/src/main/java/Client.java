
public class Client {

	public static void main(String[] args) {
		Boolean isAsync=true;
		
		
		
		Producer producer=new Producer(KafkaProperties.TOPIC1, isAsync, "hello");
		
		producer.start();
		
		System.out.println("started Producer");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		
		producer.setInterrupt(true);
	}

}
