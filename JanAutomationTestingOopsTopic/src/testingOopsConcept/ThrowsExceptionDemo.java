package testingOopsConcept;

public class ThrowsExceptionDemo {
	public void exceptionDemo() throws InterruptedException
	{
		System.out.println("START");
		Thread.sleep(2000);
		System.out.println("STOP");
	}
public static void main(String[] args) throws InterruptedException {
	ThrowsExceptionDemo ob=new ThrowsExceptionDemo();
	ob.exceptionDemo();
}
}
//yha par exception aari jab hnme likha Thread.sleep(2000) is pr jab jab pointer liya to usne remove krne ka method btaya by throws usi se ye exception remove kiya gya
