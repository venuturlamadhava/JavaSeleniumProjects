package day16;

interface shape
{
	int length=100; //final & static
	int width=200;	//final & static
	
	void circle(); //abstract method
	
	default void square()	//default method
	{
		System.out.println("This is a square..-default method");
	}
	
	static void rectangle()
	{
		System.out.println("This rectangle - static method");
	}
}

public class InterfaceDemo implements shape
{

	public void circle()
	{
		System.out.println("This is circle-Abstract method");
	}
	
	void triangle()
	{
		System.out.println("");
	}
	
	int x=100, y=200;
	
	public static void main(String[] args) {
		
		//Scenario 1
		InterfaceDemo idobj=new InterfaceDemo();
		idobj.circle();
		idobj.square();
		idobj.triangle();
		shape.rectangle(); //Staic method can directly access from interface
		System.out.println(idobj.x+idobj.y);
		//Scenario 2
		
		shape sh=new InterfaceDemo();
		
		sh.circle();
		sh.square();
		
		shape.rectangle(); //Static method can directly access from interface
		
		//sh.tiangle();  //we cannot access
		
		System.out.println(shape.length*shape.width);
		//System.out.println(sh.x+sh.y);  //cannot access
	}

}
