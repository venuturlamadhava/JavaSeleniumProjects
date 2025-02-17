package PracticeProgramsRun1;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {


		int a=200;
		int b=201;
		int c=202;
		
		if(a==b && b==c)
		{
			System.out.println("a, b and c are equal");
		}
		else
		{
			if(a==b)
			{
				if(a<c)
				{
					System.out.println("a and b are equal and smaller than c");
				}
				else
				{
					System.out.println("c is smaller than a and b");
				}
			}
			else if(b==c)
			{
				if(b<a)
				{
					System.out.println("b and c are equal and smaller than a");
				}
				else
				{
					System.out.println("a is smaller than b and c");
			}}
			else if(a==c)
			{
				if(a<b)
				{
					System.out.println("a and c are equal and smaller than b");
				}
				else
				{
					System.out.println("b is smaller than a and c");
				}
			}
			else if(a<b || a<c)
			{
				System.out.println("a is smaller than b and c");
			}
			else if(b<a || b<c)
			{
				System.out.println("b is smaller than a and c");
			}
			else
			{
				System.out.println("c is smaller than a and b");
			}	
		}
		

	}

}
