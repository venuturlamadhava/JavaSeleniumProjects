package Day7;

import java.util.Scanner;

public class TakingInputFromKeyBoard {

	public static void main(String[] args) {
		//int num=20; //Hard coded value
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(num);*/
		
		/*System.out.println("Enter decimal number:");
		double num=sc.nextDouble();
		System.out.println("Given value is:"+num);*/
		
		System.out.println("Enter your city:");
		String city=sc.next();
		System.out.println("Your city is:"+ city);
		

	}

}
