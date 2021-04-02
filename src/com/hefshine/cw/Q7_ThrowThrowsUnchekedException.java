//Write a program to display the concept of throw and throws using unchecked exception.
package com.hefshine.cw;
public class Q7_ThrowThrowsUnchekedException 
{
	void checkAge(int age)  ///throw demo
	{
		if (age<18)
			throw new ArithmeticException("Not Eligible for voting");
		else
			System.out.println("eligible for voting");
	}
	void chekAgeThrowsDemo(int age) throws ArithmeticException //throws demo
	{
		if(age<18)
		{
			throw new ArithmeticException("access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) 
	{
		Q7_ThrowThrowsUnchekedException d=new Q7_ThrowThrowsUnchekedException();
		try {
			d.checkAge(13);	
		} catch (ArithmeticException e) {
			e.getMessage();
		}
		/*try {
			d.chekAgeThrowsDemo(15);	
		} catch (ArithmeticException e) {
			e.getMessage();
		}*/
		
		System.out.println("End of Program");
		d.chekAgeThrowsDemo(15);

	}

}
