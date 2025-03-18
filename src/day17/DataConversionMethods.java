package day17;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		//String to int
		/*String s="welcome";
		int sint=Integer.parseInt(s); //(NumberFormatException.java:67)
		System.out.println(sint);*/
		
		/*String s="12345";
		int sint=Integer.parseInt(s);
		System.out.println(sint);*/
		
		/*String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		
		//String to double
		/*String s1="10.5";
		String s2="20.5";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		//String to boolean
		/*String s="True";
		System.out.println(Boolean.parseBoolean(s));*/
		
		
		//int, double, bool, char  ----String
		
		int a=10;
		double d=10.5;
		char C='C';
		boolean bool=true;
		
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(C));
		System.out.println(String.valueOf(bool));

	}

}
