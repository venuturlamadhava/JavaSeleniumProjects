package day17.pack2;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Progtam is started...");
		
		Scanner sc=new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);	//ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data..");
		}
		
		
		System.out.println("Progtam is completed...");	
		System.out.println("Progtam is exited...");

	}

}
