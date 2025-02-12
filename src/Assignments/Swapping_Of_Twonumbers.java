package Assignments;

public class Swapping_Of_Twonumbers {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		System.out.println("Before swapping values are..."+a+" "+b);
		
		//Logic1
		/*int c;
		c=a;
		a=b;
		b=c;
		*/
		//Logic2- use + & - without using thire variable
		
		/*a=a+b; //300
		b=a-b; //300-200=100
		a=a-b; //300-100=200		
		*/
		
		//Logic- use * and / without using 3rd variable
		//here a&b values should not be zero
		/*a=a*b;  //100*200=20000
		b=a/b; //20000/200=100
		a=a/b; //20000/100=200
		*/
		
		//Logic4 -bitwise XOR (^)
		/*a=a^b;
		b=a^b;
		a=a^b;
		*/
		
		//Logic5- Single statement
		//a=10 b=20
		
		b=a+b-(a=b);
		
		
		
		System.out.println("After Swapping values are..."+a+" "+b);
		
		

	}

}
