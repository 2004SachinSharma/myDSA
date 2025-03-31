package Array_string.ArrayQuestions;

import java.util.Arrays;

public class CQReverse_anArray3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        

        for (int i = arr.length-1; i >= 0; i--) {

            System.out.print(arr[i]+" ");

        }
        //Optimized approach and the most efficient solution for this problem ! 
        System.out.println("sasa");

        for( int i = 0; i < arr1.length/2; i++ ) {
            int temp = arr1[i];
            arr1[i] = arr1[(arr1.length-1) -i];
            arr1[(arr1.length-1) -i] = temp;

        }
        System.out.println(Arrays.toString(arr1));

    }


}

