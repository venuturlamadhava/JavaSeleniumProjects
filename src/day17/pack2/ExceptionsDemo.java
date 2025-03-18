package day17.pack2;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) 
	{
	System.out.println("Progtam is started...");
	
	Scanner sc=new Scanner(System.in);
	
	//Example 1
	/*System.out.println("Enter a number");
	int num=sc.nextInt();
	
	System.out.println(100/num);	//ArithmeticException
	*/
	
	//Example 2
	
	/*int a[]=new int[5];
	
	System.out.println("Enter the position(0-4)...:");
	int pos=sc.nextInt();
	
	System.out.println("Enter a value:");
	int value=sc.nextInt();
	
	a[pos]=value;		//ArrayIndexOutOfBoundsException
	System.out.println(a[pos]);
	*/
	//Example 3
	
	/*String s="Welcom";
	
	int num=Integer.parseInt(s);		//NumberFormatException
	System.out.println("num"); 
	*/
	
	//Example 4
	String s=null;			
	System.out.println(s.length());	//NullPointerException
	
	
	
	
	System.out.println("Progtam is completed...");	
	System.out.println("Progtam is exited...");	
	
	
	}

}
