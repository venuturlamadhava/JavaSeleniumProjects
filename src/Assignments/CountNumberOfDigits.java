package Assignments;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num=123456 ,count=0;
		
		/*while(num!=0)
		{
			num=num/10;
			count++;
		}*/
		
		for(count=0;num!=0;count++)
		{
			num=num/10;
		}
		
		System.out.println("Number of digits" + count);

	}

}
