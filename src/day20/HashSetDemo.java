package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet myset=new HashSet();
		
		//Set myset=new HashSet();
		
		//HashSet <String>myset=new HashSet<String>();

		//adding elements in to hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(100);
		myset.add(null);
		
		
		//printing hashset
		System.out.println(myset);
		
		//remove element
		myset.remove(10.5);
		System.out.println("After removing:-"+myset);
		
		//Inserting element
		
		//Accessing specific element-Not possible
		
		//Convert HashSet to ArrayList
		
		ArrayList al=new ArrayList(myset);
		
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all the elements using for.. each
		/*for(Object x: myset)
		{
			System.out.println(x);
		}*/
		
		//Using Iterator
		
		Iterator<Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//clearing all the elements in hashset
		
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());
	}

}
