package day15;

final class Test1
{
	final void m()
	{
		System.out.println("this is m method from Test1....");
	}
}

class Test2 extends Test1
{
	void m()	//incorrect, bcoz m() is final method
	{
		System.out.println("this is m method from Test2....");
	}
}

public class FinalKeyword2 {

	public static void main(String[] args) 
	{
		

	}

}
