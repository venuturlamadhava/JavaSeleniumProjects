package Assignments;

public class PrintWeekNumbersSwitchCase {

	public static void main(String[] args) {
		String weekname="Monday";
		
		switch(weekname)
		{
		case "Sunday" : System.out.println(1);break;
		case "Monday" : System.out.println(2);break;
		case "Tuesady" : System.out.println(3);break;
		case "Wednusday" : System.out.println(4);break;
		case "Thursday" : System.out.println(5);break;
		case "Friday" : System.out.println(6);break;
		case "Saturday" : System.out.println(7);break;
		default : System.out.println("Invalid week");break;
		}
		

	}

}
