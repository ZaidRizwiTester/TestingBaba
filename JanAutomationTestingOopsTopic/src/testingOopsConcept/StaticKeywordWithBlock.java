package testingOopsConcept;

public class StaticKeywordWithBlock {
//static int a;
	static int a=10;
public StaticKeywordWithBlock()
{
	a++;
	System.out.println(a);           //constructor hai ye
}
public static void staticMethod()
{
	System.out.println("static method of class");   //static method h ye
}
static
{
	System.out.println("static block"); 
	//a=10;                                                   //static block h ye
}
public static void main(String[] args) {
	StaticKeywordWithBlock ob =new StaticKeywordWithBlock();
	StaticKeywordWithBlock.staticMethod();
}
}
//static block main method se bhi phle likha jata h