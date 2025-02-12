package Day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		//1) Arithematic operators + - * / %
		
		int a=20, b=10;
		
		int result=a+b;
		System.out.println("Sum of a and b is:"+result);
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Mul of a and b is:"+(a*b));
		System.out.println("Div of a and b is:"+(a/b));   //Coefficent
		System.out.println("ModDiv of a and b is:"+(a%b)); //Reminder
		
		//2)Relational/comparision operators > >= < <= != ==
		//returns boolean value - true/false
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;	
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res=a>b;
		System.out.println(res);
		
		
		//3)Logical operators && || !
		//returns boolean value -true/false

		//works between 2 boolean variable
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);  //false
		System.out.println(x || y);  //True
		System.out.println(!x);  //false
		System.out.println(!y); //true
		
		boolean b1=10>20;
		System.out.println(b1); //false
		
		boolean b2=10<20;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true
		
		
		
		
		

		
		
		
	}

}
