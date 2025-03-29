package Array_string.ArrayQuestions;

import java.util.Arrays;

public class OQSort_Colours {
    public static void main(String[] args) {
        // source: Leet-Code, medium-level Question
        //Here 0 represents red, 1 represents white and 2 represents blue

        int[] arr = {1, 0, 2};
        int val = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//--------------------------More efficient algo approach, (The Three pointer approach-----------

        int[] arr2 = {1, 0, 2, 1, 0, 2};

        int l = 0,m=0;
        int h = arr2.length - 1;

        while (m <= h) {
            if (arr2[m] == 0) {
                int temp = arr2[m];
                arr2[m] = arr2[l];
                arr2[l] = temp;
                l++;
                m++;

            } else if (arr2[m] == 2) {
                int temp = arr2[m];
                arr2[m] = arr2[h];
                arr2[h] = temp;
                h--;

            } else {
                m++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

}
