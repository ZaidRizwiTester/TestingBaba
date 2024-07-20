package testingOopsConcept;

public class StringDemo {
public static void main(String[] args) {
	
		String s = "hello";  //pool area
		String s1 = "hello";  // pool area
		String s2 = new String("hello"); // heap area
		String s3 = new String("hello");  // heap area
		
		System.out.println(s==s1);  //true
		System.out.println(s1==s2);  //false
		System.out.println(s2==s3); // false
	}
}

