package Array_string.ArrayQuestions;

public class SQFind_largest_sum_contiguous_subarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("By bruteforce the largest sum is : " + largestSum(arr));
        System.out.println("By Kadane's algo the largest sum is : " + Kadane(arr));


    }

    static int largestSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }


// Kadane's Algo:
public static int Kadane(int [] arr) {
    int  current_Subarray_Sum = arr[0];
    int Max_Subarray_Sum = arr[0];

    for (int i = 1; i < arr.length; i++){
        current_Subarray_Sum =Math.max( arr[i], current_Subarray_Sum + arr[i]);
        Max_Subarray_Sum = Math.max(current_Subarray_Sum, Max_Subarray_Sum);

    }
return Max_Subarray_Sum ;
}


}
