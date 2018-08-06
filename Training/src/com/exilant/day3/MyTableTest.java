package com.exilant.day3;

import java.util.ArrayList;
import java.util.List;

class MyTable<A,B,C>//Templates
{
	private A _aa;
	private B _bb;
	private C _cc;
	public A get_aa() {
		return _aa;
	}
	public void set_aa(A _aa) {
		this._aa = _aa;
	}
	public B get_bb() {
		return _bb;
	}
	public void set_bb(B _bb) {
		this._bb = _bb;
	}
	
	public C get_cc() {
		return _cc;
	}
	public void set_cc(C _cc) {
		this._cc = _cc;
	}
	public MyTable() {
		// TODO Auto-generated constructor stub
	}
	public MyTable(A _aa, B _bb, C _cc) {
		super();
		this._aa = _aa;
		this._bb = _bb;
		this._cc = _cc;
	}
	
	
}
class Emp{}
class Dept{}
class SumThing{}


public class MyTableTest {
public static MyTable<Integer,String,Boolean> newTuple1()
{
	return new MyTable(100,"Hello",true);
}

public static MyTable<Emp,Dept,SumThing> newTuple()
{
	return new MyTable(new Emp(),new Dept(),new SumThing());
}


public static void main(String[] args) {
	MyTable<Integer,String,Boolean> tuple=newTuple1();
	
	System.out.println("Integer Value:"+tuple.get_aa());
	System.out.println("String Value:"+tuple.get_bb());
	System.out.println("Boolean Value:"+tuple.get_cc());
	
	
	
	List<MyTable<Integer,String,Boolean>> mylist=
			                new ArrayList<>();
}
}
