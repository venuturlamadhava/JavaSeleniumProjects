package codingInterviewQuestions;

public class AmstronBetween0And1000 {

	public static void main(String[] args) {
		
		
		for(int n=1;n<=1000;n++)
		{
			int a=1,i=0,j=0;
			
			a=n;
			
			for(;a>0;a=a/10)
			{
				i=a%10;
				j=(i*i*i)+j;
			}
		
			if(n==j)
			{
				System.out.println(n);
			}
		}

		

	}

}
