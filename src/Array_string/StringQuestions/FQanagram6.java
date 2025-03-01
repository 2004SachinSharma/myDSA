package Array_string.StringQuestions;

import java.util.Arrays;
// understand and rewrite the logic

public class FQanagram6 {
    public static void main(String[] args) {
        String str1 = "little".toLowerCase();
        String str2 = "titlle".toLowerCase();
        StringBuilder sb = new StringBuilder(26);

        char []c1 = str1.toCharArray();
        char []c2 = str2.toCharArray();
       Arrays.sort(c1);
       Arrays.sort(c2);

        if(Arrays.toString(c1).equals(Arrays.toString(c2))){
            System.out.println( "yess this is anagram");
        }else{
            System.out.println("nope not an anagram ");
        }



    }
}  //
 /*int[] ioi = new int[26];
        int[] oio = new int[26];
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int ascii1 = str1.charAt(i);
                int ascii2 = str2.charAt(i);
                int index1 = ascii1 - 97;
                int index2 = ascii2 - 97;

                ioi[index1] = str1.charAt(i);
                oio[index2] = str2.charAt(i);

            }
            System.out.println(Arrays.toString(ioi));
            System.out.println(Arrays.toString(oio));

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (ioi[i] == oio[i])
                    count++;
            }
            System.out.println(count);
            if (count == 26) {
                System.out.println("this is anagram");
            } else {
                System.out.println("not the anagram");
            }
        }*/

//////////////////////////////////////////////////////////////////Another one

/* int count=0;
        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                for (int j = 0; j < str2.length(); j++) {

                        if (str1.charAt(i) == str2.charAt(j)) {
                            count++;

                        }
                    }


                }
            } else {
            System.out.println("length is not equal");
        }
        if (count == str1.length())

            System.out.println(count + "Yes it is anagram");
        else {
            System.out.println(count + "Nope it is not anagram");
        }*/