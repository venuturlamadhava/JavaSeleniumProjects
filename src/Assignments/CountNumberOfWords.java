package Assignments;

public class CountNumberOfWords {

	public static void main(String[] args) {
		String sentence="Madhava is good boy and learning selenium";
		
		String words[]=sentence.trim().split("\\s");
		
		int wordcount = words.length;
		
		System.out.println(wordcount);
		
		
		
		
	}

}
