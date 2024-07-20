package testingOopsConcept;

import java.util.Scanner;

class Abcd
{
	public void getGst(float input)
	{
		float gst=(input*5)/100;
		System.out.println(gst);
	}
}

public class OverridingDemo  extends Abcd {
	public void getGst(float input)
	{
		float gst=(input*18)/100;
		System.out.println(gst);
	}
public static void main(String[] args) {
	OverridingDemo ob=new OverridingDemo();
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the amount:");
	float dd=sc.nextFloat();
	ob.getGst(dd);
	sc.close();
}

}
