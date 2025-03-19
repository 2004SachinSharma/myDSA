package Array_string.StringQuestions;

import java.util.Arrays;
// understand and rewrite the logic

public class FQanagram6 {
    public static void main(String[] args) {
        String str1 = "little".toLowerCase();
        String str2 = "titlle".toLowerCase();
    //Method 1--
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.toString(c1).equals(Arrays.toString(c2))) {
            System.out.println("yess this is anagram");
        } else {
            System.out.println("nope not an anagram ");
        }
    // Method 2--
        int[] word1 = new int[26];
        int[] word2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int ASCII1 = str1.charAt(i);
            int index1 = ASCII1 - 97;
            word1[index1]++;

            int ASCII2 = str2.charAt(i);
            int index2 = ASCII2 - 97;
            word2[index2]++;
        }
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));


        if (Arrays.toString(word1).equals(Arrays.toString(word2))) {
            System.out.println("Yes it is an anagram");

        } else {
            System.out.println("Not an anagram");
        }
    }
}


//////////////////////////////////////////////////////////////////Another one
