//Show Example of runtime stack mechanism using Arithmetic Exception.
package com.hefshine.cw;

public class Q1_Artithmetic_ExceptionDemo extends Exception
{
	public static void main(String[] args) 
	{
		int a=1,b=0;
		System.out.println("a: "+a+" b: "+b);
		try {
			int div=a/b;
			System.out.println("div:"+div);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
