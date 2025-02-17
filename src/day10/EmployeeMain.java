package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();	//object
		emp1.eid=101;
		emp1.ename="Johan";
		emp1.job="Manager";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp1.eid=102;
		emp1.ename="Peter";
		emp1.job="Sr.Manager";
		emp1.sal=75000;
		emp1.display();

	}

}
