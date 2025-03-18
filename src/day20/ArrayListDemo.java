package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		

		//ArrayList<Integer> mylist=new ArrayList<Integer>();
		//ArrayList<Employee> mylist=new ArrayList<Employee>();
		//Adding data into arraylist
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(false);
		mylist.add(null);
		mylist.add(100);
		mylist.add(null);
		
		//Size of arraylist
		
		System.out.println("Size of an arraylist:"+mylist.size());	//8
		
		//Printing arraylist
		
		System.out.println("Printing data from arraylist:"+mylist);		//[100, 10.5, Welcome, A, false, null, 100, null]
		
		//remove element from arraylist
		
		mylist.remove(5);	//here 5 is index of element
		System.out.println("After removing Printing data from arraylist:"+mylist);
		
		//Insert element in the arraylist
		mylist.add(2,"java");
		System.out.println("After insersion Printing data from arraylist:"+mylist);
		
		
		//Modify element in the arraylist(modify/replace/change)
		mylist.set(2,"python");
		System.out.println("After replacement Printing data from arraylist:"+mylist);
		
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3));		//here 3 is index
		
		//Reading all the element from array list
		
		//Using normal for loop
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//using enhanced for loop
		
		for(Object x:mylist)
		{
			System.out.println(x);
		}
		
		//Using iterator
		
		Iterator it=mylist.iterator();
		
		//System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking arraylist or not
		System.out.println(mylist.isEmpty());
		
		//remove all the elements from array
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements Printing data from arraylist:"+mylist);
		
		//remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
		
	}

}
