package Array_string.ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JQInverseArray_and_StoreInSecondArray {
    public static void main(String[] args) {
        //----------Random Problem to get the each character value of any integer value to be stored in Array
        int a = 754;
        System.out.println();

        String s = String.valueOf(a);
        char[] c = s.toCharArray();

        int[] storeNumbers = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            storeNumbers[i] = Character.getNumericValue(c[i]);
        }
        System.out.println(Arrays.toString(storeNumbers));
//--------------------------------------------------------------------------
//-----------Main_DSA_Solution_here-------------------------------
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[(arr.length - 1) - i] = arr[i];
        }
        System.out.printf(Arrays.toString(arr2));

    }
}
//------------------Fully_done_by_me_No_Cheating--------------------