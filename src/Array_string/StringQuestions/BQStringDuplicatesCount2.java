package Array_string.StringQuestions;

import java.util.Arrays;
//Que String Duplicates Count

//"This code counts the frequency of each lowercase English letter in the given string using their ASCII values,
// with values sequentially assigned to indices starting from 0 (for 'a') to 25 (for 'z')."
public class BQStringDuplicatesCount2 {
    public static void main(String[] args) {
        String str = "sachinsharmaz";
        StringBuilder sb = new StringBuilder(26);

        // Instructor Approach
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int ASCII = str.charAt(i);
            int index = ASCII - 97;
            count[index]++;
        }
       /*  optional to do , mera hi dimaag zada chal gya ;)
      for ( int i = 0 ; i < str.length() ; i++){
            int ASCII = str.charAt(i);
            int index = ASCII- 97;
            if ( count[index]>1){
                System.out.println(str.charAt(i) +" ---> "+ count[index] + " times");
            }
        }*/

        System.out.println(Arrays.toString(count)); //for quick work, for printing the Full Array the inbuilt method is used instead of that four line for loop code for doing the same
       for(int i = 0 ; i<25 ; i++){
           if(count[i]>1 ){
               char c = (char) (97+i);
               System.out.println("The total duplicates of String value " + c + " are " + count[i]);
           }
       }

    }
}


/*  Note
        by default , for small alphabets from a to z the ASCII values are from 97 to 122 , total 26 characters
                     & for Capitals starts from 65 to 90 .
        To insert them sequentially in an array indices from 0 to 25 , using there ASCII values ,
        I will have to minus 97 from there ASCII values in the case of smalls
        and minus 65 in the case of Capitals , vice versa I will have to add them (97 and 65) to get values !
  */

    /*Another Approach

        boolean [] no_duplicate = new boolean[str.length()];

        for ( int i = 0; i < str.length(); i++){
            int count = 0;


            if ( !no_duplicate[i]) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                        no_duplicate[j] = true;

                    }
                }
                System.out.println("In " + str + " the count of " + str.charAt(i) + " is = " + count );

            }
            }
        */
