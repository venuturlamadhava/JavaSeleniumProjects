package PracticeProgramsRun1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		//Method 1
		/*int c=0;
		
		System.out.println("a value before Swapping" +a);
		System.out.println("b value before Swapping" +b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("a value after Swapping" +a);
		System.out.println("b value after Swapping" +b);*/
		
		//Method 2
		
		System.out.println("a value before Swapping" +a);
		System.out.println("b value before Swapping" +b);
		
		a=a+b; //300
		b=a-b; //300-200
		a=a-b;
		
		System.out.println("a value after Swapping" +a);
		System.out.println("b value after Swapping" +b);
		
	}

}
