package day12;

public class AdderMain {

	public static void main(String[] args) {
		Adder addobj=new Adder();
		
		addobj.sum();	//1
		
		addobj.sum(100,200); //2
		
		addobj.sum(10.5,20); //4
		
		addobj.sum(10,10.5);	//3
		
		addobj.sum(10,20,30);	//5
		
		//addobj.sum(10.5,20.5,15.0);
	}

}
