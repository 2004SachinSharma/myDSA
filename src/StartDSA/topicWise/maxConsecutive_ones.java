package StartDSA.topicWise;

public class maxConsecutive_ones {
    public static void main(String [] args){
        int [] arr = {1,1,0,1,1,1};

//       int count =  maxConsecutive_ones.maxConsecutive(arr);
//        System.out.println(count);
       int counts = maxConsecutive_ones.max(arr);
        System.out.println(counts);
    }

   static int maxConsecutive(int[] arr){
        int i = 0;
        int j= 1;
        int count = 0;
//        int streak = 0;

        while(j<arr.length) {
            if (arr[i] == arr[j]) {
                count++;

            }
            j++;
            i++;
        }
        return count;
    }

    static int max(int [] arr ){
        int i = 0;
        int max = 0;
        int streak = 0;

        while(i<arr.length) {
            if (arr[i] == 1) {
                streak++;
                max = Math.max(streak, max);
            }else {
                streak = 0;
            }
            i++;

        }
        return max;
    }
}
