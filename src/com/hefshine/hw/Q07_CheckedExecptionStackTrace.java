//Write a program to display and check if checked Exception is propagated in calling stack.
package com.hefshine.hw;

public class Q07_CheckedExecptionStackTrace 
{

	public static void main(String[] args) 
	{
		try {
			System.out.println(12/0);	
		} catch (ArithmeticException e)
		{
		
			e.printStackTrace();
		}
		

	}

}
