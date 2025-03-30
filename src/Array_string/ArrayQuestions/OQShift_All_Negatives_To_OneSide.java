package Array_string.ArrayQuestions;

import java.util.Arrays;

public class OQShift_All_Negatives_To_OneSide {
    public static void main(String[] args) {
        int [] arr =  {1, 2, -3, -4, 5, -6};

        int i = 0, m = 0;

        while (m < arr.length) {
            if(arr[m] < 0){
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp;
                i++;
                m++;
            }else{
                m++;
            }
        }
        System.out.println(Arrays.toString(arr));
// Here both the loops work similarly just diff is the loop itself , one is while and other is for loop
        // choice is totally upon us , by which we want to go
        int [] arr1 =  {1, 2, -3, -4, 5, -6};

        int j = 0;
        for (int n = 0 ; n<arr1.length; n++){
            if (arr1[n] < 0){
                int temp = arr1[n];
                arr1[n] = arr1[j];
                arr1[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
