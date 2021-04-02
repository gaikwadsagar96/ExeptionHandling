//Display an example of checked exception and simultaneously use multiple catch block.
package com.hefshine.cw;

import java.io.IOError;
import java.sql.SQLException;

public class Q05_MultipleCatchBlock 
{

	public static void main(String[] args) 
	{
		int a=1,b=0;
		System.out.println("a: "+a+" b: "+b);
		try {
			int div=a/b;
			System.out.println("div:"+div);
		} 
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (IOError e) {
			e.printStackTrace();
		}
		

	}

}
