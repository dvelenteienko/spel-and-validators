package my.dvelenteienko.SpeLAndPropsValidator.recursion;

import java.util.Arrays;
import java.util.List;

public class RecursionProbe {

    public static void main(String[] args) {
        System.out.println("\nFactorial 5 = " + factorial(5));
        String str1 = "abc";
        String str2 = "cab";
        findAnagrams(str1, str2);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Base case: if the length of both strings is not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert strings to character arrays for easier manipulation
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Convert sorted character arrays back to strings
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);
        // Check if the sorted strings are equal
        return sortedStr1.equals(sortedStr2);
    }

    // Helper method to generate permutations
    private static void generatePermutations(String prefix, String remaining, boolean[] used, String str2) {
        // Base case: if the prefix length equals the length of str2, check if they are anagrams
        if (prefix.length() == str2.length()) {
            if (areAnagrams(prefix, str2)) {
                System.out.println(prefix + " is an anagram of " + str2);
            }
            return;
        }
        // Iterate through each character of the remaining string
        for (int i = 0; i < remaining.length(); i++) {
            // If the character is already used, skip
            if (used[i]) {
                continue;
            }
            // Mark the character as used
            used[i] = true;
            // Recur with the next character added to the prefix and the remaining characters
            generatePermutations(prefix + remaining.charAt(i), remaining, used, str2);
            // Unmark the character after the recursion
            used[i] = false;
        }
    }

    // Method to start generating permutations
    public static void findAnagrams(String str1, String str2) {
        boolean[] used = new boolean[str1.length()];
        generatePermutations("", str1, used, str2);
    }
}
