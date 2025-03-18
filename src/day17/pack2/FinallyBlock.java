package day17.pack2;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Progtam is started...");
		String s=null;
		
		try
		{
		System.out.println(s.length());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handling exception...");
			System.out.println(e.getMessage());	
		}
		finally
		{
			System.out.println("you are entered into finally block....");
		}
		
		
		System.out.println("Program finished......");
		
	}

}
