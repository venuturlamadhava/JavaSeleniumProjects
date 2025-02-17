package Day6;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		//char s[]= {'A','X','B','N'};
		
		String s[]= {"Scoot","Madhava","John","David","Bravo"};
		
		System.out.println("Before sorting...."+ Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After sorting...."+ Arrays.toString(s));

	}

}
