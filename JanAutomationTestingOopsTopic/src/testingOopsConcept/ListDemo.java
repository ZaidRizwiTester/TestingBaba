package testingOopsConcept;

import java.util.ArrayList;

public class ListDemo {
public static void main(String[] args) {
	ArrayList<String> list =  new ArrayList<String>();                                   //<>in braces k ander data type ka refer class daalna hai.jis type ka data ham daal rhe hai
	list.add("noida");
	list.add("Delhi");
	list.add("ghaziabad");
	list.add("hapur");
	//String val=list.get(2);
	//System.out.println(val);
	
	
	/*for(int i=0;i<list.size();i++)
	{
		String val=list.get(i);
		System.out.println(val);
	}*/
	System.out.println(list.size()); //isse list ka size pta chalta h
	int i=0;
	while(i<list.size())
	{
		String val2=list.get(i);
		i++;
		System.out.println(val2);
	}
	
}
}
