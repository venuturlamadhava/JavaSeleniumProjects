package PracticeProgramsRun1;

public class PrintWeekBasedOnNumberSwitchCase {

	public static void main(String[] args) {


		int week_num=1;
		/*switch(variable)
		{
		case value1: statements;
		case value2: statements;
		case value3: statements;
		default: statements;
		}
		*/
		switch(week_num)
		{
			case 0 : System.out.println("Monday"); break;
			case 1 : System.out.println("Tuesaday");break;
			case 2 : System.out.println("Wednusday");break;
			case 3 : System.out.println("Thursady");break;
			case 4 : System.out.println("Friday"); break;
			case 5 : System.out.println("Saturday");break;
			case 6 : System.out.println("Sunday"); break;
			default : System.out.println("Invalid week number");
		}
	}

}
