package testingOopsConcept;
class E
{
	public void methodE()
	{
		System.out.println("method of class E");
	}
}
class F extends E
{
	public void methodF()

{
		System.out.println("method of class F");
}
}



public class HirarchielInheritanceDemo extends E {
	public static void main(String[] args) {
		HirarchielInheritanceDemo ob=new HirarchielInheritanceDemo();
		ob.methodE();
		F ob1=new F();
		ob1.methodE();
		ob1.methodF();
	}

}
