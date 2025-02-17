package Assignments;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		String s="abcdedcba";
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("Given String is a palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
		
	}

}
