package testingOopsConcept;
class FD
{
	public void methodFD()
	{
		System.out.println("method of class FD");
	}
}
public class InheritanceDemo2  extends FD{
	public void methodofInheritance()
	{
		System.out.println("method of calss inheritance demo:");
	}
public static void main(String[] args) {
	InheritanceDemo2 ob=new InheritanceDemo2();
	ob.methodofInheritance();
	ob.methodFD();
	FD ob1=new InheritanceDemo2();//here ham child classs ka object bana rhe hai or referance kisko de rhe h parent class ko.
	 ob1.methodFD();                                  //ye line jab possible h jab parent child relation ho means inheritance ho.
	
}
}
