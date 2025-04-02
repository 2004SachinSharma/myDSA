package Array_string.ArrayQuestions;

import java.util.Arrays;

public class QQLeft_Rotate_Array_by_kSteps {
    static void leftRotate(int[] arr, int k) {
        if(k <0){
            k = k + arr.length;
        }

        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.printf("left Rotated Array : " + Arrays.toString(arr) + "Rotated by: k = %d \n", k);

        k++;
        System.out.println(k);
    }

    static void rightRotate(int[] arr, int k) {
        if(k <0){
            k = k + arr.length;
        }

        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.printf("Right Rotated Array : " + Arrays.toString(arr) + "Rotated by: k = %d", k);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = -3 % arr.length; //Here this expression would get us the left and right rotation , like on +Ve the left rotation will happen and vice versa
        System.out.println("Original Array 1 : " + Arrays.toString(arr));

        QQLeft_Rotate_Array_by_kSteps.leftRotate(arr, k);

        System.out.println("Original Array 2 : " + Arrays.toString(arr1));


        QQLeft_Rotate_Array_by_kSteps.rightRotate(arr1, k);

      //reversal algo!
        QQLeft_Rotate_Array_by_kSteps.rotate(arr2, k);


    }

    // Reversal algo., recommended algo for DSA interviews
    static void reverse(int [] arr, int start, int end){

        for(int i = start ; i < end; i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }

    }
   static void rotate(int[] arr, int k) {
        if(k <0){
           k = k + arr.length;
       }
       reverse(arr, 0, k-1);
       reverse(arr, k, arr.length-1);
       reverse(arr, 0, arr.length-1);

       System.out.println(Arrays.toString(arr));

    }
}



