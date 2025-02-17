package Assignments;

public class ReplaceSpacesInString {

	public static void main(String[] args) {
		String input="qwer qwer qwert hjk";
		String output="";
		
		output=	input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output);

	}

}
