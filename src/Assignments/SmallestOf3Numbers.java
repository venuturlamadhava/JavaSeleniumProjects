package Assignments;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
		int a=100, b=200, c=300;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest number");
		}
		else
		{
			System.out.println("c is smallest number");
		}

	}

}
