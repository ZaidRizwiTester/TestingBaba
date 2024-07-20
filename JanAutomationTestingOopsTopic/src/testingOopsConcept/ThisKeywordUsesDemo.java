package testingOopsConcept;

import java.util.Scanner;

public class ThisKeywordUsesDemo {
String name;
int rollnum;
public void printdetails(String name,int rollnum)
{
	this.name=name;
	this.rollnum=rollnum;
	System.out.println(name + " " + rollnum);
}
public static void main(String[] args) {
	ThisKeywordUsesDemo ob=new ThisKeywordUsesDemo();
	Scanner sc =new Scanner(System.in);
	System.out.println("plz enter details");
	String name=sc.next();
	int rollno=sc.nextInt();
	ob.printdetails("zaid", 1456);
}
}
