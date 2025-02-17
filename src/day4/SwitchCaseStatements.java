package day4;

public class SwitchCaseStatements {

	public static void main(String[] args) 
	{
	int weeknum=10;
	
	switch(weeknum)
	{
	case 1: System.out.println("Sunday");break;
	case 2: System.out.println("Monday");break;
	case 3: System.out.println("Tuesday");break;
	case 4: System.out.println("Wednusday");break;
	case 5: System.out.println("Thursday");break;
	case 6: System.out.println("Friday");break;
	case 7: System.out.println("Saturday");break;
	default: System.out.println("invalid week number");
	}

	}

}
