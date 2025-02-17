package Assignments;

public class RemoveSpecialCharactersInString {

	public static void main(String[] args) {
		String s="235#134%2356&";
		
		String output="";
		
		output=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(output);
		
		
	}

}
