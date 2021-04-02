/*Create a class, Demo with a method, division with two int parameters a. Dividend b. Divisor
	This method should divide the dividend by divisor and return the result.
	This method should also throw an Arithmetic Exception to the calling method.
Step 2: Create a class, Throws Demo with a main method
	The main method should invoke the division method in Demo class
	The main method should also catch the Arithmetic Exception thrown by the division
	method and print the Exception “Arithmetic Exception is Thrown”
	The try/catch block should also have a finally block which prints a message
	“The result is”<Result>
Step 1:In the Demo class division method perform the following logic.
	a. If Divisor is zero throw a Arithmetic Exception with message “Divisor cannot be zero”
	b. This method should throw this Arithmetic Exception.
	c. Step 2: The exception thrown needs to be handled in Throws Demo.
	d. The main method should catch the Arithmetic Exception thrown by the division method and
		print the Exception and print the message in the exception Object.
	e. The try/catch block should also have a finally block which prints a message “The result is”*/
package com.hefshine.hw;

public class Q08_ThrowsDemo extends demo
{

	public static void main(String[] args) 
	{
		String res = "";
		Q08_ThrowsDemo td=new Q08_ThrowsDemo();
		try {
			
			res=td.division(12, 0);
			//res=td.division(12,	6);
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is Thrown");
			System.out.println(e.getMessage());
			
		}finally {
				System.out.println("result is<"+res +">");
		}		
	}
	

}
class demo extends Exception
{
	String division(int dividend,int divisor)
	{
		if(divisor==0)
			throw new ArithmeticException("divisor should be greater than zero");
		else 
			return (""+dividend/divisor);
	}
}
