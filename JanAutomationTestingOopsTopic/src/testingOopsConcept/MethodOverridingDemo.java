package testingOopsConcept;
class Abc
{
	public float getGst(float input)
	{
		float gst=(input*5)/100;
		return gst;
	}
}
public class MethodOverridingDemo extends Abc {
	public float getGst(float input)
	{
		float gst=(input*18)/100;
		return gst;
	}
	public static void main(String[] args) {
		MethodOverridingDemo ob =new MethodOverridingDemo();
		float out =ob.getGst(1000);
		System.out.println(out);
	}

}
