package com.exilant.day2;

public class WorkerInterfaceTest {

	public static void main(String[] args) {
     Runner runner=new Runner();
     runner.execute(new WorkerInterface() {
		
		@Override
		public void doSomeWork() {
			System.out.println("We are doing some work in main");
			
		}
	});
     
   //using lambda expression
     runner.execute(()->System.out.println("we are doing some work in lambda way in main"));
	
	
	runner.execute(()->
	{
		System.out.println("lambda way in lambda way");
		System.out.println("buisness logic");
	});
	}

	
	
}
