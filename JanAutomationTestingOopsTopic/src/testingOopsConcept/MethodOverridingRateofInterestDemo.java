package testingOopsConcept;
class ROI
{
	public void calROI(int amount)
	{
	float roi=(amount*5)/100;	
	System.out.println(roi);
	}
}
class SBI extends ROI
{
	public void calROI(int amount)
	{
		float roi=(amount*8)/100;
		System.out.println(roi);
		
	}
}
class icici extends ROI
{
	public void calROI(int amount)
	{
		float roi=(amount*11)/100;
		System.out.println(roi);
		
	}
}
public class MethodOverridingRateofInterestDemo {
	
public static void main(String[] args) {
	MethodOverridingRateofInterestDemo ob=new MethodOverridingRateofInterestDemo();
	icici ob1=new icici();
	ob1.calROI(100);
	ROI ob2=new icici();
	ob2.calROI(1000);
	
	
}
}
