package pjava;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silence";
        
        if (areAnagrams(string1, string2)) {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        } else {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Remove white spaces and punctuation
        String cleanS1 = s1.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        String cleanS2 = s2.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();

        // Check if the sorted characters of both strings are the same
        char[] charArray1 = cleanS1.toCharArray();
        char[] charArray2 = cleanS2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}