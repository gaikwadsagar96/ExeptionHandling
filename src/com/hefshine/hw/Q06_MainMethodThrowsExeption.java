//Write a program to display a message if main method throws an exception.
package com.hefshine.hw;
class InvalidException extends Exception
{
	public InvalidException(String s)
	{
		super(s);
	}
}
public class Q06_MainMethodThrowsExeption 
{

	public static void main(String[] args) throws InvalidException	
	{
		
			System.out.println(12/0);	
		
		

	}

}
