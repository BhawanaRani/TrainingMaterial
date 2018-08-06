package com.exilant.day3;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTest01 {

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
      ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
      ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("nashorn");
      
      String name="Bhawana";
      
      Integer result=null;
      scriptEngine.eval("print('"+name+"')");
      result =(Integer)scriptEngine.eval("10+20");
      
      System.out.println("Result is:"+result);
	}

}
