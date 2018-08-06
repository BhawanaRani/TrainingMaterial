package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadServices {
//this method willl create set of callable(each callable is 1 thread
	public static Set<Callable<String>> initializeCallable()
	{
		Set<Callable<String>> callable=new HashSet<Callable<String>>();
		callable.add(()->"ist callable");
		callable.add(()->"2nd callable");
		callable.add(()->"3rd callable");
		callable.add(()->"fourth callable");
		callable.add(()->"fifth callable");
		callable.add(()->"sixth callable");
		callable.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
			return "callable thread is anonymous class";
			}
			
		});
		
		callable.add(()->{return "complex buisness logic";});
		return callable;
	}
	public static void main(String[] args) {
		
		// java 7
     ExecutorService eS=Executors.newSingleThreadExecutor();
     eS.execute(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("in Anonymous block");
			
		}
	});
     eS.shutdown();
     
     //java 8
     ExecutorService eS1=Executors.newSingleThreadExecutor();
     eS1.execute(()-> System.out.println("in Anonymous block1"));
 
     eS1.shutdown();
     
     
     
     System.out.println("-----------------callable work-------------------");
     ExecutorService eS3=Executors.newSingleThreadExecutor();
     Set<Callable<String>> callObjs=initializeCallable();
     try {
		//String result=eS3.invokeAny(callObjs);
    	 List<Future<String>> result=eS3.invokeAll(callObjs);
    	 result.forEach(n->{
			try {
				System.out.println(n.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
