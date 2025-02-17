package Assignments;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Welcome";
		String rev="";
		
		System.out.println("String before reverse:"+s);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("String after reverse:"+rev);
	}

}
