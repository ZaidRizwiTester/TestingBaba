package testingOopsConcept;


class Details
{
	private String name;
	private int rollnum;// yha sirf variable declare kiye initialize nhi kiye.
	public void setName(String name)
	{
		this.name=name;//method k through hi name set kiye yha
	}
	public String getName() //yha is method m string likha void nhi bcz hme method ko return type bnana h
	{
		return name;
	}
	public void setRollnum(int rollnum)
	{
		this.rollnum=rollnum;
	}
	public int getRollNo()   //yha is method m int  likha void nhi bcz hme method ko return type bnana h
	{
		return rollnum;
	}
	
}
public class EncapsulationDemo {
public static void main(String[] args) {
	Details ob=new Details();
	ob.setName("Ramesh");
	System.out.println(ob.getName());
	ob.setRollnum(14522);
	System.out.println(ob.getRollNo());
}
}
//private is a access modifier iska scope within the class hai.
