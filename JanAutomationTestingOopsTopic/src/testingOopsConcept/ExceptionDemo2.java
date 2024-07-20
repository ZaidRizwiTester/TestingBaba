package testingOopsConcept;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void exceptionDemo2(int a, int b)
	{
		System.out.println("hello world");
		
		int c=a/b;
		System.out.println(c);
		System.out.println("program executed sucessfully");
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("plz provide inputs");
	int a=sc.nextInt();
	int b =sc.nextInt();
	exceptionDemo2(a,b);
	sc.close();
	
}
}
//yha pr jab ise run kya to input manga suppose user ne ek input shi de dya ek glat de dya wo bhi exception h
