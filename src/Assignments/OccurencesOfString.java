package Assignments;

public class OccurencesOfString{

    public static void main(String[] args) {
        String S = "qwesdrfghjkmlwesrdfghjknm";
        int count = 0;
        char c = 'd'; // The character you want to count
        
        // Loop through the string and count occurrences of the character 'd'
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == c) {
                count++;
            }
        }
        
        // Print the count of occurrences of the character
        System.out.println("Occurrences of '" + c + "': " + count);
    }
}
