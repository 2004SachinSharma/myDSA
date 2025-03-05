package Array_string.ArrayQuestions;

public class IQMax_1s_Maxconsecutives16 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,2,2,2,3,3,1,1,1,1,1,1,1,1,1,12,2};
        int count = 0;
        int counti = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] && arr[i]==1) {
                count++;
            } else {
                count = 0;
            }

            if (count > counti) {
                counti = count;

            }
        }
        System.out.println(counti);} // prints counti



    }





