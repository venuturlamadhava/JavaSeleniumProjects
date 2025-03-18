package codingInterviewQuestions;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter a number...:");
		
		int b=sc3.nextInt();
		int n=b;
		
		int i=0,rev1=0;
		while(b!=0)
		{
			i=b%10;
			rev1=rev1*10+i;
			b=b/10;
		}
		System.out.println((rev1));
		
		if(n==rev1)
		{
			System.out.println("Number is a palindrome");	
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
		
	}

}
