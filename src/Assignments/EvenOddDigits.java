package Assignments;

public class EvenOddDigits {

	public static void main(String[] args) {
	int num=123456 ,count=0, evencount=0, oddcount=0;
		
	
	while(num>0)
	{
		int reminder=num%10;
		if(reminder%2==0)
		{
			evencount++;	
		}
		else
			oddcount++;
		
		num=num/10;
	}


		System.out.println("Even count"+evencount);
		System.out.println("Odd count"+ oddcount);
		

	}

}
