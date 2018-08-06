package com.exilant.day1;

public class LambdaExpNew {
//to show functional interface implementation
	
	//An Interface exactly with only one method then it is eligible to b Functional Interface
	
	@FunctionalInterface
	interface MathOperation
	{
		int operation(int n1,int n2);
	}
	public static void main(String[] args) {
 MathOperation add=(n1,n2)->n1+n2;
 MathOperation sub=(n1,n2)->n1-n2;	
 MathOperation mul=(n1,n2)->n1*n2;
 
 System.out.println(operation(2, 3,add));
 System.out.println(operation(3, 3,sub));
 System.out.println(operation(3, 3,mul));
 
 
 new Thread(new Runnable() {
	
	@Override
	public void run() {
		System.out.println("Anonymous call1");
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Anonymous call1 exiting");
	}
}).start();
 
 new Thread(()->
 {
 System.out.println("Anonymous call2");
 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Anonymous call2 exiting");
 }).start();
	
 }
 public static int operation(int n1,int n2,MathOperation mO)
 {
	 return mO.operation(n1, n2);
 }
}
