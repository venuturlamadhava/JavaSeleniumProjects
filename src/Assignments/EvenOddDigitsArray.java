package Assignments;

public class EvenOddDigitsArray {

	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4,5,6,8};
	int evennum=0, oddnum=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			evennum++;
		}
		else
		{
			oddnum++;
		}		
	}
	System.out.println("Number of even"+" "+ evennum);
	System.out.println("Number of odd"+" "+ oddnum);

	}

}
