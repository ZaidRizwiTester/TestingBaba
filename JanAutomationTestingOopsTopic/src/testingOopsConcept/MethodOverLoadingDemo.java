package testingOopsConcept;

public class MethodOverLoadingDemo {
	public void getTrain(int TrainNo)
	{
		System.out.println("garibrath");
	}
	public void getTrain(String TrainName)
	{
		System.out.println(TrainName);
	}
	public void getTrain(String fromStn,String toStn)
	{
		System.out.println("jammumail");
	}
	public static void main(String[] args) {
		MethodOverLoadingDemo ob=new MethodOverLoadingDemo();
		ob.getTrain(1235);
		ob.getTrain("jammutavi");
		ob.getTrain("delhi", "ayodhya");
		
	}

}
