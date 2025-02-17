package day11;

public class ConstructorDemo {

	int x,y;
	
	ConstructorDemo()	//default constructor
	{
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a, int b) 	//parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
		//ConstructorDemo cd=new ConstructorDemo();
		
		ConstructorDemo cd=new ConstructorDemo(23,23);
		cd.sum();

	}

}
