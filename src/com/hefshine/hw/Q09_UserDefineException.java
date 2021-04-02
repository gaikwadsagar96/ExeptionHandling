/*A shopping portal provides users to register their profile. During registration the
system needs to validate the user age above 18 and should be placed in India. If not the
system should throw an appropriate error.
	a. Create a user defined exception classes named “InvalidCoUNtryException” & “InvalidAgeException”
	b. Overload the respective constructors.
	c. Create a main class “User Registration” , 
	add the following method,
	i. registerProfile -The parameter are String userName , int age, String country.
	ii. Add the following logic
	d. if country is not equal to “India” throw a InvalidCountryException with error If age < 18 throw a InvalidAgeException 
	   with error message“ User is a Minor”.
	e. Invoke the method register Profile from the main method with the data specified and see how the program behaves:*/
package com.hefshine.hw;
class InvalidCoUNtryException extends Exception
{
	InvalidCoUNtryException(String s) 
	{
		super(s);
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class Q09_UserDefineException 
{
	void registration(String userName,String country,int age) throws InvalidAgeException,InvalidCoUNtryException
	{
		if (country!="india") 
		{
				throw new InvalidCoUNtryException("out side of india not allowed" );	
		}
		else if(age<18) 
		{
				throw new InvalidAgeException("User is a Minor");
		}
		else 
		{
			System.out.println("registration successfull");
		}
		
	}
	public static void main(String[] args) 
	{	
		Q09_UserDefineException ud=new Q09_UserDefineException();
			try {
				//ud.registration("ram","india",12);
				//ud.registration("ram", "india",22);
				//ud.registration("ram", "us", 22);
				ud.registration("ram", "us", 12);
			} catch (InvalidAgeException e ) {
				System.out.println(e.getMessage());
			}catch(InvalidCoUNtryException e) {
				System.out.println(e.getMessage());
			}
		}
}

