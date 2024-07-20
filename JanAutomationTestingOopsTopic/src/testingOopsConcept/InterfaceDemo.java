package testingOopsConcept;
interface Animal
{
	public void eat();
	public void run();
	public void bark();
}
class Dog implements Animal   // jab ham ye line likhenge to error aayegi us error par click krenge to niche jo logic h khud ba khud aa jayega
{

	@Override
	public void eat() {
		System.out.println("dog eat buscuit");		
	}

	@Override
	public void run() {
		System.out.println("dog run");
	}

	@Override
	public void bark() {
		System.out.println("dog barks very loudly");		
	}

	
	
}
public class InterfaceDemo extends Dog {
public static void main(String[] args) {
	InterfaceDemo ob=new InterfaceDemo();
	ob.eat();
	Dog ob1=new Dog();
	ob1.bark();
}
}
