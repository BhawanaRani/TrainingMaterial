package com.exilant.day2;
//do all the buisness  logics
public class Runner {
public void execute(WorkerInterface workerInterface)
{
	System.out.println("in execute method");
	workerInterface.doSomeWork();
}
}
