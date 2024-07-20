package testingOopsConcept;

class GSTS
{
	public GSTS(int num)
	{
		System.out.println("parent class constructor");
	}
	public void clclGST(int amount)
	{
		float gst=(amount*5)/100;
		System.out.println("old gsts cl " + gst);
	}
}

public class ConstructorBehaviourInOverriding extends GSTS {
	public ConstructorBehaviourInOverriding()
	{
		super(100);
		System.out.println("child class constructor");
	}
public void clclGST(int amount)
{
	super.clclGST(100);
	float gst=(amount*18)/100;
	System.out.println("new gst cl " +gst);
	
}
public static void main(String[] args) {
	ConstructorBehaviourInOverriding ob=new ConstructorBehaviourInOverriding();
ob.clclGST(1000);
}
}
//ye program example hai super keyword ka in method overriding