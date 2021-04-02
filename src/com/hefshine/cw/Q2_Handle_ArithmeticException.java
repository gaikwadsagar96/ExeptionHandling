package com.hefshine.cw;

public class Q2_Handle_ArithmeticException 
{

	public static void main(String[] args) 
	{
		int a=1,b=0;
		System.out.println("a: "+a+" b: "+b);
		try {
			int div=a/b;
			System.out.println("div:"+div);
		} catch (ArithmeticException e) 
		{
			//e.printStackTrace();
			System.out.println("divisor should not be zero");
		}

	}

}
