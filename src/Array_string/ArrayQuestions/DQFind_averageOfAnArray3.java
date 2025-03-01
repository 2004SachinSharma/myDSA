package Array_string.ArrayQuestions;
// average finding
public class DQFind_averageOfAnArray3 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 3, 7, 5, 8, 2};

        int addition = 0;
        for (int arrr : arr) {
            addition += arrr;
        }
        System.out.println(addition/arr.length);

    }
}
