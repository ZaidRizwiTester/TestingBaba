package testingOopsConcept;

public class StaticKeywordWithMethod {
	static int a=10;
	public static void staticMethod()//yha par hamne method ko static bna dya by using keword static.
	{
		a++;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		/*StaticKeywordWithMethod ob=new StaticKeywordWithMethod();
		StaticKeywordWithMethod ob1=new StaticKeywordWithMethod();
		StaticKeywordWithMethod ob2=new StaticKeywordWithMethod();*/
		StaticKeywordWithMethod.staticMethod();
		
	}
}
