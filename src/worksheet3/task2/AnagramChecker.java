package worksheet3.task2;

import java.util.Scanner;

public class AnagramChecker {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        int[] chars1 = countLetters(a);
        int[] chars2 = countLetters(b);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i])
                return false;
        }
        return true;
    }

    /**
     * Helper method to count how many times each letter (a-z) appears .
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray ()) {
            if(c-'a'>=-1 && c-'a'<counts.length)counts[Character.toLowerCase(c) - 'a']++;
        }
        return counts;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
        int[] letters = countLetters(s);
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != 0) {
                char c = (char) (97 + i);
                System.out.println(c + "=" + letters[i]);
            }
        }
        /*
         * ArrayList<Character> letters = new ArrayList<Character>();
         * ArrayList<Integer> counts = new ArrayList<Integer>();
         * for(int i = 0;i<s.length();i++){
         * char a = s.charAt(i);
         * for(int j = 0;j<letters.size();j++){
         * if(a==letters.get(i)){
         * counts.
         * }
         * }
         * }
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get two strings from the user
        System.out.print(" Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print(" Enter the second string: ");
        String word2 = scanner.nextLine();
        scanner.close();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        word1.replaceAll(" ","");
        word2.replaceAll(" ","");
        //while (word1.contains(" ")) {
        //    int i = word1.indexOf(" ");
        //   word1 = word1.substring(0, i) + word1.substring(i + 1, word1.length());
        //}
        //while (word2.contains(" ")) {
        //   int i = word2.indexOf(" ");
        //    word2 = word2.substring(0, i) + word2.substring(i + 1, word2.length());
        //}

        System.out.println(" Are they anagrams ? " + isAnagram(word1, word2));
        printLetterCounts(word1);

        String string1 = "abc ";
        String string2 = "abc "; //Mit new String -> false
        System.out.println(string1 == string2); // true
        System.out.println(new String("abc") == string2); // false
        System.out.println("a"+"bc" == string2); // false??
    }
}
