package Array_string.ArrayQuestions;

import java.util.Arrays;

public class NQShift_All_Zeroes_To_Right {
    public static void main(String[] args) {
        int [] arr = {0,0,1,0,3,0,2,2,3,0,10};
     //--ThisIsMyApproach--IThoughtDeeplyandAppliedMyOwnLogic--ThoughNotOptimizedApproach--WillSeeFurtherForMoreSolutionWIthOptimizedApproach----------------
       int a = 0;
       int zeroOfPresentIndex ;
       for ( int i = 0; i < arr.length; i++ ) {
           if (arr[a] == 0) {
               zeroOfPresentIndex  =  arr[a];
               for (int j = a; j < arr.length - 1; j++) {
                   arr[j] = arr[j + 1];
               }
               arr[arr.length - 1] = zeroOfPresentIndex;
           } else {
               a++;
           }
       }
        System.out.println(Arrays.toString(arr));

    }
}
//-------------------------------MyApproach-------------------------------------------------------------