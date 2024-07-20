package testingOopsConcept;

public class ConstructorDemo {
	public ConstructorDemo()
	{
		System.out.println("non parameterized");
	}
	public ConstructorDemo(int num)
	{
		System.out.println("parameterized " +num*2 );
	}
	public void printHello()
	{
		System.out.println("hello");
	}
public static void main(String[] args) {
	ConstructorDemo ob=new ConstructorDemo();
	ConstructorDemo ob1=new ConstructorDemo(10);
    ob.printHello();
}
}
