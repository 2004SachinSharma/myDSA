package Array_string.ArrayQuestions;

public class BQAdd_Alternate_arrayValues2 {
    public static void main(String[] args) {

        int[] arr_numbers = {-2, -3, -4, -5, -6, -70, -8, -9, -4, -9, -1, -550};
        String[] arr_String = {"String", "a", "b", "c", "d", "e"};

        int count_3 = AddingAlternateValue_1(arr_numbers);
        System.out.println(
                "count_3 " + count_3
        );
        System.out.println("//-----------------------------------------------");

    }

    public static int AddingAlternateValue_1(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            a += arr[i];
        }
        System.out.println("Printing value from AddingAlternateValue() Method " + a + " Actual size is \n" + arr.length);
        // Another approach could be by using the Modulo,
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                b += arr[i];
            }
            if (arr.length == i) {
                System.out.println(" By Modulo way " + b);
            }
        }
        System.out.println(" By Modulo way " + b); // for printing this simple statement,there is no need to use if-else statement that is used above , to get this printing done
        // , if else is just created to show another approach to print the final added value for all alternate array's value

        // One more approach :
        int c = -1;
        int c2 = 0;
        for (int arri : arr) {
            c++;
            if (c % 2 == 0) {
                c2 += arr[c];
            }
        }
        System.out.println("This is for-each approach " + c2);

        return a;

    }
}
