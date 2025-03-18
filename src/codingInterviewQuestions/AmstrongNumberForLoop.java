package codingInterviewQuestions;

import java.util.Scanner;

public class AmstrongNumberForLoop {

	public static void main(String[] args) {
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter a numbe..:");
		int Aminput=sc4.nextInt();
		
		int x=Aminput;
		int Am=0;
		
		for(;Aminput>0;Aminput=Aminput/10)
		{
			int i=Aminput%10;
			Am=(i*i*i)+Am;
		}
		
		System.out.println(Am);
		
		if(x==Am)
		{
			System.out.println("Number is Amstrong");
		}
		else
		{
			System.out.println("Number is not Amstrong");
		}
		
	}

}
