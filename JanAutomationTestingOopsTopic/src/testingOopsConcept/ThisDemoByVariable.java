package testingOopsConcept;

import java.util.Scanner;

public class ThisDemoByVariable {
String name;
int rollNo;   //global variable h bcz class level pr define h.
public void provideDetails(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}
public void display()
{
	System.out.println(name + " "+ rollNo );
}
public static void main(String[] args) {
	ThisDemoByVariable ob=new ThisDemoByVariable();
	Scanner sc =new Scanner(System.in);
	System.out.println("please provide details");
	String name=sc.next();
	int rollnum=sc.nextInt();
	ob.provideDetails(name, rollnum);
	ob.display();
}

}
