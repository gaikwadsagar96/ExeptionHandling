//Write a program to generate and handle ArrayIndexOutOfBound Exception using try catch.
package com.hefshine.hw;

public class Q05_ArrayOutBoundException 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		try {
		System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("index is not more than "+a.length);
		}
	}

}
