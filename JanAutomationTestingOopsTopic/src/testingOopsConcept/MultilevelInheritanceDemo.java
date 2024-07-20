package testingOopsConcept;
class C
{
	public void methodC()
	{
		System.out.println("method of class C");
	}
}
class B extends C
{
	public void methodB() 
	{
		System.out.println("method of class B");
	}
}


public class MultilevelInheritanceDemo extends B {
public static void main(String[] args) {
	MultilevelInheritanceDemo ob=new MultilevelInheritanceDemo();
	ob.methodB();
	ob.methodC();
	
}
}
