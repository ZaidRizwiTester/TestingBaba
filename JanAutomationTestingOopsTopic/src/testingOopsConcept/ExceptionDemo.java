package testingOopsConcept;

public class ExceptionDemo {
	
	public static void exceptionDemo()
	{
		System.out.println("Hello World");
		 int a=10;
		 int b=0;
		 int c=a/b;
		System.out.println(c);
		System.out.println("programme executed sucessfully:");
	}
public static void main(String[] args) {
	ExceptionDemo.exceptionDemo();
}
}
//yha kya ho rha hai phle phli line print hui "Hello world" ab logic par aaya logic fail ho gya bcz any num when devide by zero gives infinity
//to program execution yha ruk gya fail ho gya isi ko exception bolte hai .ab aage k jitne bhi logic honge koi run nhi hone whether right isi ko handle karna hai
//k ek logic glat hone se entire code m prob na aye isi ko exception handling bolte hai.
//is program mai jo exception hai wo hai arithmatic exception