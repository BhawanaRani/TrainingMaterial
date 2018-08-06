package com.exilant.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSTest02 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		// TODO Auto-generated method stub
		
		 ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
	      ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("nashorn");
	      
	      scriptEngine.eval(new FileReader("resources/com/js/nashron.js"));
          System.out.println(scriptEngine.eval("x()"));
	}

}
