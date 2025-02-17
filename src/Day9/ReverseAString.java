package Day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		//Approch 1
		/*String s="Welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		*/
		
		//Approch 2-without using string methods
		
		/*String s="welcome";
		String rev="";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverese string:"+rev);*/
		
		
		//Approch 3: using StringBuffer Class
		
		StringBuffer s= new StringBuffer("welcome");
		System.out.println(s);
		
		System.out.println("Reverse string is:" + s.reverse());
		
		//Approch4 - using StringBuilder class
		StringBuilder sb= new StringBuilder("welcome");
		System.out.println(sb);
		
		System.out.println("Revere String is:" +sb.reverse());
		
	}

}
