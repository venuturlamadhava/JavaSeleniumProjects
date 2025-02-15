package Assignments;

public class Palindrome {

	public static void main(String[] args) {
		int num=01233210, rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Number after reverse"+ rev);
		
		if(num==rev)
		{
			System.out.println("Number is a palindrome");
		}
		else
			System.out.println("Number is not a palindrome");
		

	}

}
