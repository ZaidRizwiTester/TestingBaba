package testingOopsConcept;

public class ThisKeywordUseInMethod  {
public void methodA()
{
	System.out.println("hello");
	this.methodB();
	this.methodC();
}
public void methodB()
{
	System.out.println("byyyy");
}
public void methodC()
{
	System.out.println("salaam");
}
public static void main(String[] args) {
	ThisKeywordUseInMethod ob=new ThisKeywordUseInMethod();	
	ob.methodA();
	
	
}
}
