package PracticeProgramsRun1;

public class ReverseANumber {

	public static void main(String[] args) {
		int x=123456;
		int rev=0;
		
		for(;x!=0;x=x/10)
		{
			int digit=x%10;
			rev=rev*10+digit;
		}
		
		System.out.println(rev);

	}

}
