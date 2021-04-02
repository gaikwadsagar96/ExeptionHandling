//Write a program to display the concept of throw by creating a user defined exception and use
//trycatch to handle the exception.

package com.hefshine.cw;
class InvalidAge extends Exception
{
	public InvalidAge(String s) {
		super(s);
	}
}
public class Q8_UserDefineException 
{

	public static void main(String[] args) 
	{
		Q8_UserDefineException ud=new Q8_UserDefineException();
		try {
			ud.checkAge(15);
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}

	}

	private void checkAge(int age) throws InvalidAge 
	{
		if(age<18)
		{
			throw new InvalidAge("age must be 18");
		}
		else {
			System.out.println("welcome to .....");
		}
		
	}

}
