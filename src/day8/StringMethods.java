package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		/*String s="Welcome";
		String S=new String("Welcome1");
		System.out.println(s);
		System.out.println(S);*/

		String s="   Welcome    ";
		int l=s.length();
		System.out.println(l);
		System.out.println(s.length());
		
		
		//concat()-joining strings
		
		String s1="Welcome";
		String s2=" To java";
		String s3=" Automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println(s1.concat(s2+s3));
		
		//trim() - remove spaces left and right side
		
		System.out.println("before trimming:"+" " + s.length());		
		System.out.println(s.trim());
		
		System.out.println(s.trim().length());
		
		
		//CharAt() - returns a character from a string based on index
		
		s="Welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		
		//contains()- returns true/false
		
		System.out.println(s.contains("Wel"));  //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("wel")); //false
		System.out.println(s.contains("welme"));
		
		//equals(), equalsIgnoreCase()- compare strings
		
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2);	//true
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1.equals("Welcome")); //false
		System.out.println(s1.equalsIgnoreCase("Welcome")); 	//true
		
		//replace() - replace single/multiple(sequence) of characters in a string
		
		s="welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'x'));
		
		System.out.println(s.replace("selenium", "Playwrite"));
		
		
		//substring()- extract substring from main string
		//Starting index-0
		//Ending index -1
		
		s="Selenium";
		System.out.println(s.substring(1,5));	//elen
		System.out.println(s.substring(0,3));	//Sel
		
		//toUpperCase()  toLowerCase()
		s="Welcome";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
		//split() - split the string into multiple parts based on delimiter
		
		s="abcdefgahaoo@gmail.com";
		
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a)); //[abcdefgahaoo, gmail.com]
		System.out.println(a[0]);	//abcdefgahaoo
		System.out.println(a[1]);	//gmail.com
		
		//ex1
		
		String amount="$15,20,55";  //Exp 152055
		
		System.out.println(amount.replace("$",""));	//15,20,55
		
		System.out.println(amount.replace("$","").replace(",","")); //152055
		
		//Ex2
		
		s="abc,123@xyz";
		
		String arr1[]=s.split(",");
		System.out.println(Arrays.toString(arr1)); //[ab, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); 	//[123, xyz]
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		
		//ex3
		
		s="abc 123 xyz";
		String ar[]=s.split(" ");
		
		System.out.println(Arrays.toString(ar)); //[abc, 123, xyz]
		
		//ex4
		String name="John Kenedy";
		
		System.out.println(name.contains("john")); //false
		
		System.out.println(name.replace('J', 'j').contains("john")); //true
		
		System.out.println(name.toLowerCase().contains("john"));
		
		
	}

}
