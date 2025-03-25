package Array_string.ArrayQuestions;

public class KQGet_Index_Of_Any_Array_value {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -4, -5, -6, -70, -8, -9, -4, -9, -1, -550};

            int findTheNum = -6;

            for ( int i = 0; i < arr.length ; i++ ){

                if(arr[i] == findTheNum) {
                    System.out.printf("The value: %d is present on index no: %d", arr[i], i);

                }


            }

        }
}


