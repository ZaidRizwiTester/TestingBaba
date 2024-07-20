package testingOopsConcept;

import java.util.Scanner;

public class ThrowExceptionDemo {
	public void validateAge(int age)
	{
		try
		{
			if(age<18)
			{
				throw new Exception("age is not valid");
			}
			else
			{
				System.out.println("age is valid");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
			main(null);
		}
		System.out.println("HELLO ZAID");
	}
public static void main(String[] args) {
	ThrowExceptionDemo ob=new ThrowExceptionDemo();
	Scanner sc=new Scanner(System.in);
	System.out.println("PLEASE PROVIDE VALID AGE");
	int num=sc.nextInt();
	ob.validateAge(num);
	
	
}
}
//Throw is a self declaration exception
