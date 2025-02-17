package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//Muteable - can change
		int a[]= {20,30,10,50,30};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		//immutable-cannot change
		
		String s=new String("Welcome");
		System.out.println(s);
		String conctestring=s.concat(" to java");
		System.out.println(s);
		
		System.out.println(conctestring);
		
		
		}

}
