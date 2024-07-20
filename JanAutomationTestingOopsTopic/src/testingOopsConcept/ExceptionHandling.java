package testingOopsConcept;

import java.util.Scanner;

public class ExceptionHandling {
	public void showData()
	{
		System.out.println("SHOW YOUR DATA");
	}
	public void getData()        //is program m hmne methods bnaye ab run time pr jab hmne 5/0 kiya to exception aaya
	                            // usko handle krne k liye hmne try catch block use kiya (try likhkr control+shift press kro)
	{                            //jo logic hmne getData method me likha tha wo copy krke try m daal diya
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("PLEASE ENTER VALID INPUT");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			sc.close();
		}
		catch (Exception e)       /*if we remove catch block from here then if any exception occur that will not be 
		                              handle and further aage k method ,logic proceed nhi honge but finally block still run krega uspr
		                              koi effect nhi pdega */
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("FINALLY BLOCK");
			
		}
		
	}
	
	public void helloData()
	{
		System.out.println("HELLO DATA");
	}
	public static void main(String[] args) {
		ExceptionHandling ob=new ExceptionHandling();
		ob.showData();
		ob.getData();
		ob.helloData();
	}
	

}

