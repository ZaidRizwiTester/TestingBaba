package testingOopsConcept;

import java.util.ArrayList;

public class ListDemo2 {
public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<Object>();// <> inme ab hmne object likha isse ham hetrogenious data bhi likh skte h
	list.add(1);
	list.add(10);
	list.add("hapur");
	list.add("delhi");
	list.add('v');
	list.add(0, 10);
	list.add(10); //list me value same add kr skte h
	/*int i=0;
	while(i<list.size())
	{
		Object val2=list.get(i);
		i++;
		System.out.println(val2);
	}*/
	/*for each loop*/
	for(Object dd:list)//is line ka mtlb ye h ye "list" h is list mai multiple data pda hua h hetrogenious type ka hmne ek variable lya "dd" uska type define kr dya "Object"
	{
	System.out.println(dd);	
	}
	
	
}
}
