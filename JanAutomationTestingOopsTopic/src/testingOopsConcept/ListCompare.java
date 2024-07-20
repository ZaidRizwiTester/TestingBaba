package testingOopsConcept;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCompare {
	public void compareList(ArrayList<Character> list1,ArrayList<Character> list2)
	{
		/*for(Character ch1:list1)
		{
			for(Character ch2:list2)
			{
				if(ch1==ch2)
				{
					System.out.println(true);
					list2.remove(ch2);
				}
				break;                                                       //lecture-47 m hai
			}
		}*/
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				/*list1.get(i);
				list2.get(j);
				if(list1.get(i)==list2.get(j))

				{
					System.out.println(true);
					list2.remove(j);
					break;
				}*/
				System.out.println(list1.get(i)==list2.get(j));
				list2.remove(j);
				break;
			}
		}
	}
public static void main(String[] args) {
	ListCompare ob=new ListCompare();
	ArrayList<Character> list1=new ArrayList<Character>();
	ArrayList<Character> list2=new ArrayList<Character>();
	Scanner sc=new Scanner(System.in);
	System.out.println("plzz enter values in list 1");
	for(int i=0;i<4;i++)
	{
		list1.add(sc.next().charAt(0));
	}
System.out.println("plzz enter values in list 2");
for(int i=0;i<4;i++)
{
	list2.add(sc.next().charAt(0));
}
ob.compareList(list1, list2);
}
}
