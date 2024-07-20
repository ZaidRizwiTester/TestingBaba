package testingOopsConcept;
class ZAID
{
	public void RIZWI()
	{
		System.out.println("zaid is a good boiii");
	}
}
public class SuperKeywordUseInOverriding extends ZAID {
	public void  RIZWI()
	{
		super.RIZWI();
		System.out.println("zaid is not a good boiii:");
	}
	public static void main(String[] args) {
		SuperKeywordUseInOverriding ob =new SuperKeywordUseInOverriding();
		ob.RIZWI();
	}

}
