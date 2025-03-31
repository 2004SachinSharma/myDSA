package Array_string.ArrayQuestions;

import java.util.Arrays;

public class CQReverse_anArray3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int j = 0;

        for (int i = arr.length-1; i >= 0; i--) {

            System.out.print(arr[i]+" ");

        }
        //Optimized approach
        System.out.println("sasa");

        for( int i = 0; i < arr1.length/2; i++ ) {
            int temp = arr1[i];
            arr1[i] = arr1[(arr1.length-1) -i];
            arr1[(arr1.length-1) -i] = temp;

        }
        System.out.println(Arrays.toString(arr1));

        perf: Optimal Array Reversal with Least Complexity

        - Implemented the **most efficient array reversal** using half traversal.
        - Achieved **O(n)** time complexity with only **n/2 iterations**, minimizing operations.
                - Utilized **in-place swapping (O(1) space)**, avoiding extra memory usage.
                - This solution offers **the least complexity** for array reversal, making it ideal for large datasets.



    }


}

