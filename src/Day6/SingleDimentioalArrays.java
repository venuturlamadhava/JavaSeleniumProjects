package Day6;

public class SingleDimentioalArrays {

	public static void main(String[] args) {

//1)Declare an array
		//Approach 1
		/*int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//Approch 2
		
		int a[]= {100,200,300,400,500};
		
		
		//3)Find length of an array
		
		System.out.println("Length of an array" + a.length);
		
		//read single value from an array
		System.out.println(a[4]);
		
		//read multiple values from an array
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		//enhanced for loop/for each loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
