package testingOopsConcept;
class ConstructDemo
{
	
	public  ConstructDemo()
	{
		this(10);
		System.out.println("non parameterised constructor");
	}
	public ConstructDemo(int num)
	{
		System.out.println("parameterized constructor with value " +num);
	}
}
public class ThisKeywordUseByConstructor  extends ConstructDemo {
public static void main(String[] args) {
	ConstructDemo ob =new ConstructDemo();
	
	
}
}
//this keyword use in constructor: if hmare program m bhot sare constructor ho to hme baar baar constructor ka object na create krna pde isse bachne k liye we use this keyword.