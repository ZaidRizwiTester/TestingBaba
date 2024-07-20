package testingOopsConcept;
class T
{
	public T(int num)
	{
		System.out.println("class T constructor");
	}
}
public class ConstructorBehaviourInInheritanceDemo extends T {
	public ConstructorBehaviourInInheritanceDemo( )
	{
		super(10);
		System.out.println("class ConstructorBehaviourInInheritanceDemo constructor");
	}
	
public static void main(String[] args) {
	ConstructorBehaviourInInheritanceDemo ob=new ConstructorBehaviourInInheritanceDemo();
	
}
}
