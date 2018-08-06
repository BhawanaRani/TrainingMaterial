package com.exilant.day2;

public class StrLengthTest {

	public static void main(String[] args) {
		CompareStrings str=new CompareStrings();
		str.displayResult((n1,n2)->{
		String res=	(n1.length()-n2.length())>0?n1:n2;
		return res;
		}, "Bhawana", "Malayalam");

	}

}
