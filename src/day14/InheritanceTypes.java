package day14;


	
	class A
	{
		int a=100;
		void display()
		{
			System.out.println(a);
		}
	}
	
	class B extends A
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
		
	}
	
	class C extends B
	{
		int c=300;
		void print()
		{
			System.out.println(c);
		}
	}
	
	public class InheritanceTypes {

	public static void main(String[] args) {
		
		/*B bobj=new B();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.display();
		bobj.show();*/
		
		C cobj=new C();
		
		cobj.a=123;
		cobj.b=321;
		cobj.c=345;
		
		cobj.display();
		cobj.show();
		cobj.print();

	}

}
