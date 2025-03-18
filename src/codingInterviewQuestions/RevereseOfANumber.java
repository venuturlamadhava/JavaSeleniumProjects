package codingInterviewQuestions;

import java.util.Scanner;

public class RevereseOfANumber {

	public static void main(String[] args) {


		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a numbe...:");
		
		int num=sc1.nextInt();
		
		int rev=0;
		for(;num!=0;num=num/10)
		{
			int digit=num%10;
			rev=rev*10+digit;
		}
		System.out.println("reversed number is...:"+" "+rev);

	}

}
