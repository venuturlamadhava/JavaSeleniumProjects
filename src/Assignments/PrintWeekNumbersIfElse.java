package Assignments;

public class PrintWeekNumbersIfElse {

	public static void main(String[] args) {
		String weekname="Tueseday";
		
		if(weekname=="Sunday")
		{
			System.out.println(1);
		}
		else if(weekname=="Tueseday")
		{
			System.out.println(2);
		}	
		else if(weekname=="Wednusday")
		{
			System.out.println(3);
		}
		else if(weekname=="Thursday")
		{
			System.out.println(4);
		}
		else if(weekname=="Friday")
		{
			System.out.println(5);
		}
		else if(weekname=="Saturday")
		{
			System.out.println(6);
		}
		else
		{
			System.out.println("invalid week");
		}

	}

}
