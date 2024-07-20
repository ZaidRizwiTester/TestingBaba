package testingOopsConcept;

import java.util.LinkedList;

public class LinkedListDemo{
public static void main(String[] args) {
	
LinkedList<Object> list=new LinkedList<Object>();
list.add(1);
list.add(51);
list.add("zaid");
list.add("noida");
list.add('h');
list.add('o');
list.remove(4);
list.add(0, "rizwi");
for(Object dd:list)
{
	System.out.println(dd);
}

}
}
