package Array_string.ArrayQuestions;

import java.util.Arrays;

public class GQSorting_an_Array3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 2, 0, 1, 2, 4, 0, 0, 1};

        //This is Brute force algo ,it can be more efficient using other approaches like , Quick and merge sort!
        //Time and space complexities are : O(n^2) and O(1) respectively.

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;

            while (j < arr.length) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                   j++;
                }else j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
