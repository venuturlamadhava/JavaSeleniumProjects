package codingInterviewQuestions;

import java.util.Scanner;

public class AmStrongNumber {

	public static void main(String[] args) {
		Scanner sc3=new Scanner(System.in);
		
		System.out.println("Enter a number...:");
		
		int Am=sc3.nextInt();
		
		int Amstrong=Am;
		int i=0,j=0;
		while(Am>0)
		{
			i=Am%10;
			j=(i*i*i)+j;
			Am=Am/10;
		}
		System.out.println(j);
		
		if(Amstrong==j)
		{
			System.out.println("NUmber is a Amstrong");
		}
		else
		{
			System.out.println("Number is not AMstrong");
		}
		
	}

}
