package testingOopsConcept;

public class StaticKeywordWithVariable {
	static int a=10;
	public StaticKeywordWithVariable()
	{
		a++;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		StaticKeywordWithVariable ob=new StaticKeywordWithVariable();
		StaticKeywordWithVariable ob1=new StaticKeywordWithVariable();
		StaticKeywordWithVariable ob2=new StaticKeywordWithVariable();

		
	}
}
