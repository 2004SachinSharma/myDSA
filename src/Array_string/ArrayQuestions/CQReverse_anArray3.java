package Array_string.ArrayQuestions;

public class CQReverse_anArray3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
      //  int[] arr1 = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i]+" ");

            // Another approach : below num2 variable can be removed if I use out of class present below commented out code just after the for - loop
            // at line 24 to 28


            //  System.out.printf("The index of array 1 is %d and value is  %d : ", i, num);


        }
           // other very easy approach



    }


}
// Another approach:
/*
        for ( int arrr : arr1){
            System.out.print(arrr+" ");

        }


        System.out.println("");
  for ( int arrr : arr){
            System.out.print(arrr+" ");
        }


*/
