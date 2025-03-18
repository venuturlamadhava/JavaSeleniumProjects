package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding Pairs
		
		hm.put(101, "John");
		hm.put(102, "John1");
		hm.put(103, "peter");
		hm.put(104, "Scott");
		hm.put(102, "Mary");
		System.out.println(hm);
		
		System.out.println("Size of hashmap:"+hm.size());
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing:"+hm);
		
		//Access value of the key
		System.out.println(hm.get(102));
		
		//Get all the keys from HashMap
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//Reading data from HashMap
		
		//Using for..each
		
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		//Using iterator
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry entry=it.next();
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}
