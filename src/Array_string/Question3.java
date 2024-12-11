package Array_string;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {


            arr1[j] =  arr[i];
            int num2 = arr1[j];


          //  System.out.printf("The index of array 1 is %d and value is  %d : ", i, num);
            System.out.print(num2+" ");
            j++;
        }
        System.out.println();

        for ( int arrr : arr){
            System.out.print(arrr+" ");
        }


    }


}
