package Array_string.ArrayQuestions;

import java.util.Arrays;

public class OQSort_Colours {
   public static void main(String[] args) {
       // source: Leet-Code, medium-level Question
       //Here 0 represents red, 1 represents white and 2 represents blue

       int [ ] arr = {1,0,2};
       int val = 0;

       for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
               if( arr[i] > arr[j] ){
                   val = arr[i];
                   arr[i] = arr[j] ;
                   arr[j] = val;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
   }

}
