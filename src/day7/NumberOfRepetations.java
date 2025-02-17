package day7;

public class NumberOfRepetations {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,100,100,300,200,100};
		
		int num=300;
		int count=0;
		
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
			
		}
		System.out.println(count);
		

	}

}
