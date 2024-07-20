package testingOopsConcept;
abstract class Abs_Demo
{
	abstract void getfeature();
	
	public void getdetails()
	{
		System.out.println("user details");
	}
	
}
public class AbstractionDemo extends Abs_Demo {

	@Override
	void getfeature() {
		 
	System.out.println("hello");	
	}
	
	public static void main(String[] args) {
		AbstractionDemo ob=new AbstractionDemo();
		ob.getfeature();
		ob.getdetails();
	}
	
	}


