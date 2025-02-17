package Day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String -immuteable
		/*String s="welcome";
		s.concat("to java");
		System.out.println(s); //immuteable, cannot change original value of s
		*/
		//StringBuffer - mutable
		/*StringBuffer s=new StringBuffer("welcome");
		s.append(" to java");
		System.out.println(s); //welcome to java //muteable, we can change the original value
		*/
		//StringBuilder - muteable
		
		StringBuilder s=new StringBuilder("welcome");
		s.append(" to java");
		System.out.println(s);

	}

}
