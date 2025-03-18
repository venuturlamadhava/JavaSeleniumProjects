package day17.pack2;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
		System.out.println("Progtam is started...");
		String s=null;
		
		try
		{
		System.out.println(s.length());
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Handling exception...");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handling exception...");
			System.out.println(e.getMessage());	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handling exception...");
			System.out.println(e.getMessage());	
		}*/
		catch(Exception e)
		{
			System.out.println("Handling exception...");
			System.out.println(e.getMessage());	
		}
		
		
		System.out.println("Program finished......");

	}

}
