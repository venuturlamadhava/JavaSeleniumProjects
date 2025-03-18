package day18;

import day16.C1;

class Parent
{
	String name="john";
	
	void m1()
	{
		System.out.println("this is m1 from parent class...");
	}
}

class Child extends Parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from child class....");
	}
}


public class TypeCastingObjects1 {

	public static void main(String[] args) 
	{
		/*Child c=new Child();
		System.out.println(c.name);  //Parent
		c.m1();						//Parent
		System.out.println(c.id);	//Child
		c.m2();						//child

		/*Parent p=new Child();	//upcasting
		System.out.println(p.name);  //Parent
		p.m1();						//Parent
		System.out.println(p.id);	//Child--we cannot access
		p.m2();	*/					//child--we cannot access
		
		
		
	}

}
