package Array_string.ArrayQuestions;

public class AQFind_Size_Of_Array1 {
    public static void main(String[] args) {


        int[] arr_numbers = {-2, -3, -4, -5, -6, -70, -8, -9, -4, -9, -1, -550};
        String[] arr_String = {"String", "a", "b", "c", "d", "e"};


        // Problem 1: To get the size of an Array without using the pre-defined method to get Size , neither directly nor indirectly.

        int count_1 = findingSizeOfArray_1(arr_numbers);
        System.out.println("count_1 " + count_1);

        System.out.println("//-----------------------------------------------");

        // Problem 1: To get the size of an Array without directly using the pre-defined method to get Size.

        int count_2 = findingSizeOfArray_2(arr_numbers);
        System.out.println("count_2 " + count_2);
    }
    public static int findingSizeOfArray_1(int[] arr) {
        int a = 0;
        for (int Arr : arr) {
            a++;
            System.out.println("Printing value from findingSizeOfArray_1() Method " + a); // The value can be printed as well for just displaying in the program
        }
        System.out.printf("So the value is %d\n", a);
        return a; // the value can be returned to use further in the program
    }


    // Problem 1: To get the size of an Array without directly using the pre-defined method to get Size.

    public static int findingSizeOfArray_2(int[] arr) {
        int a = 0;
        for (int i = 1; i <= arr.length; i++) {
            a++;
        }
        System.out.println("Printing value from findingSizeOfArray_2() Method " + a);

        return a;

    }

}
