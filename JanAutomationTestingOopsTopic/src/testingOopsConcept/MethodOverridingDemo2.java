package testingOopsConcept;
class GST
{
	public void calculateGST(int amount)
	{
		float gst=(amount*5)/100;
		System.out.println("old gst calculatedd is " +gst);
	}
}
    public class MethodOverridingDemo2 extends GST{ 
          
	public void calculateGST(int amount)
	{
		float gst=(amount*18)/100;
		System.out.println("new gst calculated is " + gst);
	}
	public static void main(String[] args) {
		MethodOverridingDemo2 ob=new MethodOverridingDemo2();
		ob.calculateGST(500);
		GST ob3 =new MethodOverridingDemo2();//child class ka object create kye refrence liye parent class ka
		                                     //yha pr method ka name same h isiliye child class override kr jayegi parent class se
		ob3.calculateGST(1000);
	}

}
