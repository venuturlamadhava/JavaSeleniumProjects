package day18;

//Upcasting- converting value from smaller to larger
// int---->Long
//float---->double

//Downcasting-Converting value from larger to smaller
//long---->int
//double---->float



public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//upcasting - automatic -----smaller to longer
		
		/*int intvalue=100;
		long longvalue=intvalue;
		
		System.out.println(longvalue);*/
		
		//float floatvalue=10.5F;
		//double doublevalue=floatvalue;
		
		
		//downcasting- manually---larger type to smaller
		
		//long longvalue=10000;
		//int intvalue=(int)longvalue;
		
//		double doublevalue=125.55;
//		float floatvalue=(float)doublevalue;
		
		//example1
		/*int i=100;
		double d=i;
		
		System.out.println(d); 	//100*/
		
		//example2
		
		double d=10.5;
		int i=(int)d;		//downcasting
		System.out.println(i);
		
	}

}
