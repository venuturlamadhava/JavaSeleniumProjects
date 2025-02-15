package Assignments;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=12345, reversed = 0;
		System.out.println("number before reverse"+ num);
		
		while(num!=0)
		{
			reversed=reversed*10+num%10;
			num=num/10;
		}
		
		System.out.println("number after reverse"+ reversed);
		
	}

}
