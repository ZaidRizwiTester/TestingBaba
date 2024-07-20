package testingOopsConcept;


public class ExceptionDemo3 {
	
	public static void exceptionDemo3()
	{
		String name=null;
		System.out.println(name.charAt(0));
		System.out.println("hello zaid");
		//strin="za";-------this is compile time exception  .matlab likhte waqt hi error de rha.
	}                      //run time exception wo hoti h jab program complete likh dya run krne par error aa gyi,wo hota h run time exception.
public static void main(String[] args) {
	
	exceptionDemo3();
}
}
//yha pr string name m hmne null dala hai or fir jab hmne likha name.charAt(0) likha to program fail ho gya bcz string name null h
//is program mai jo exception hai wo hai null point exception
//is program mai jo exception hai wo hai string index out of bound exception