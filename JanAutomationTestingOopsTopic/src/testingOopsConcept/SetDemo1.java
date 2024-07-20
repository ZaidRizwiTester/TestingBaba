package testingOopsConcept;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 {
public static void main(String[] args) {
	HashSet<Integer> set=new HashSet<Integer>();  //yha par hmne set create kiya
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(5);
	set.add(1); //set m duplicate allow nhi h
	set.add(7);
	
	Iterator<Integer> it=set.iterator();     //it is variable here yha ham values ko iterate krre h or it variable m rakh rhe h
while(it.hasNext()) // values fatch krne ka way
{
	System.out.println(it.next());
}
/*ArrayList<Integer> list=new ArrayList<Integer>(set);
list.get(0) ; 
System.out.println(list.get(0));//us set jo above line m create kiya usko is line m hmne Array list m convert kr dya but abhi iski need nhi h but ye conversion ka way h*/
}

}
//agr hm hashset ki jgah linkedhashset and treeSet wala dekhna chachte h wo bhi same program hoga bas hashset ki jgah linkedhashset ya treeset likh do
