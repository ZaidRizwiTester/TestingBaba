package testingOopsConcept;

class A
{
	public void methodA()
	{
		System.out.println("method of class A");
	}
}

public class InheritanceDemo  extends A   //here "inheritancedemo" is the child class and "A" is the parent class
{
public static void main(String[] args) {
	InheritanceDemo ob=new InheritanceDemo();
	ob.methodA();
}
}
//Above ^ this is an example of single level inheritance....