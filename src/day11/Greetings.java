package day11;

public class Greetings 
{
//1)No params No return value
	
	void m1()
	{
		System.out.println("Hello.....");
	}
	
//2)No params Return value
	String m2()
	{
		return("Hello.....How are you");
	}
	
//3)Takes params No return value
	
	void m3(String name)
	{
		System.out.println("Hello"+name);
	}
//4)Takes params Return value
	String m4(String name)
	{
		return ("Hello"+name);
	}
	
}
