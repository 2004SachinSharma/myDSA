package Array_string.ArrayQuestions;

public class HQSecondMin_and_SecondMax3 {
    public static void main(String[] args) {


        int arr[] = {4,7};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int s_max = Integer.MIN_VALUE;
        int s_min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                s_max = max;
                max = arr[i];
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }


        }

        System.out.println("maximum is" + max);

        if (s_max == Integer.MAX_VALUE) { // means if no second maximum is there
            System.out.println("-1");
        } else {
            System.out.println("second minimum is " + s_max);
        }

        for (int data : arr) {
            if (data < min) {
                s_min = min;
                min = data;
            } else if (data < s_min && data != min) {
                s_min = data;
            }

        }
        System.out.println("minimum is " + min);

        if (s_min == Integer.MIN_VALUE) { // means if no second minimum is there
            System.out.println("-1");
        } else {
            System.out.println("second minimum is " + s_min);
        }

    }
}