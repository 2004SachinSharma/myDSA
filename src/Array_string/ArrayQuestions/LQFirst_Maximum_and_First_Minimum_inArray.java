package Array_string.ArrayQuestions;

public class LQFirst_Maximum_and_First_Minimum_inArray {
    public static void main(String[] args) {
        int [] arr = {2,5,1,8,5,3,1,10,100,1000,1,2,};
        int max = arr[0];
        int min = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (max < arr[a])
                max = arr[a];
            else if (min > arr[a])
                min = arr[a];
        }
        System.out.printf("so the maximum is %d , and minimum is %d ", max, min);


    }


}
