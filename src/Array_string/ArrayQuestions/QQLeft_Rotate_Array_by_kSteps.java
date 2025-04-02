package Array_string.ArrayQuestions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class QQLeft_Rotate_Array_by_kSteps {
    static void leftRotate(int[] arr, int k) {

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
        int k = 13 % arr.length;
        System.out.println("Original Array 1 : " + Arrays.toString(arr));

        QQLeft_Rotate_Array_by_kSteps.leftRotate(arr, k);

        System.out.println("Original Array 2 : " + Arrays.toString(arr1));


        QQLeft_Rotate_Array_by_kSteps.rightRotate(arr1, k);

        QQLeft_Rotate_Array_by_kSteps.rotate(arr2, k);


    }
                            // 1,2,3,4,5,6,7,8,9

   static void rotate(int[] arr, int k) {
        int key1 = k-1, key2 = k;
        for (int i = 0; i < key1; i++) {
            int temp = arr[i];
            arr[i] = arr[key1];
            arr[key1] = temp;
            key1--;
        }

        for (int i = key2; i < arr.length/2; i++) {
            int temp = arr[(arr.length -1) -i];
            arr[(arr.length - 1 )- i] = arr[i];
            arr[i] = temp;

        }
       for(int i = 0; i<arr.length; i++){
           int temp = arr[(arr.length - 1) - i];
           arr[(arr.length - 1 )- i] = arr[i];
           arr[i] = temp;

       }

        System.out.println(Arrays.toString(arr));
    }
}



