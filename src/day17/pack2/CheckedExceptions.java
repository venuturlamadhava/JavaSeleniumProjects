package day17.pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Progtam is started...");
		System.out.println("Progtam is inprogress...");
		
		FileInputStream fis=new FileInputStream("C:\\TEXT.txt");
		
		
		Thread.sleep(5000);
		
		/*try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}*/
		
		System.out.println("Progtam finished...");
		System.out.println("Progtam Exited...");



	}

}
