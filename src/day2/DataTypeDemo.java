package day2;

public class DataTypeDemo 
{

	public static void main(String[] args) 
	{
		//Numeric data type
		int a=100, b=200;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println("the sum of a and b is:"+(a+b));
		
		byte by=125;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=123456723456789L;
		System.out.println(l);
		
		
		//Decimal numbers- float, double
		
		float item_price=15.5F;
		System.out.println(item_price);
		
		double dbl=1234.13573365;
		System.out.println(dbl);
		
		char grad='A';
		System.out.println(grad);
		
		String name="Madhava";
		System.out.println(name);
		
		//char ch='ABC';  //invalid
		//String ch='ABC'; //invalid
		//String ch='A'; //invalid
		//String ch="A"; //valid
		
//		boolean bl=false; //allows only true or false
//		System.out.println(bl);
		
		//boolean bl="true"; //not valid
		//boolean bl="false"; //not valid
		
		//String bl=true; //not valid
		String bl="true"; //valid
		
		
	}

}
