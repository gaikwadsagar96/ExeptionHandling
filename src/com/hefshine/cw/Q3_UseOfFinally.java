//Write a program to display and explain the use of finally.
package com.hefshine.cw;

public class Q3_UseOfFinally 
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
		finally {
			System.out.println( "display from finally");
		}

	}

}
