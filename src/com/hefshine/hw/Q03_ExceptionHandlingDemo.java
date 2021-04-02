//Write a program to display any one Exception and catch that Exception using try catch.
package com.hefshine.hw;

public class Q03_ExceptionHandlingDemo 
{

	public static void main(String[] args) 
	{
		int a=12,b=0;
		try {
		int div=a/b;
		System.out.println(div);
		}catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
