package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
