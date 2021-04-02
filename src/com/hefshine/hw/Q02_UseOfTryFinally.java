//Write a program to display example where only try and finally block is used.
package com.hefshine.hw;

public class Q02_UseOfTryFinally 
{

	public static void main(String[] args) 
	{
	try {
		System.out.println(12/0);
	}finally {
		System.out.println("you are in finally block");
	}

	}

}
