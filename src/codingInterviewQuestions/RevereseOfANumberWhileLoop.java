package codingInterviewQuestions;

import java.util.Scanner;

public class RevereseOfANumberWhileLoop {

	public static void main(String[] args) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter a number...:");
		
		int a=sc2.nextInt();
		
		int i=0,j = 0;
		
		while(a>0)
		{
			i=a%10;
			j=j*10+i;
			a=a/10;
		}

		System.out.println("Reversed number...:"+" "+j);

	}

}
