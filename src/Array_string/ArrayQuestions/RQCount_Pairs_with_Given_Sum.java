package Array_string.ArrayQuestions;

public class RQCount_Pairs_with_Given_Sum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,6,3,4};
        int k = 5;
        int c = 0;
        for ( int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++ ){
                if( arr[i]+arr[j] == k  ){
                    System.out.printf("(%d,%d)=%d \n",arr[i],arr[j],k );
                c++;
                }
            }
        }
        System.out.printf("Total pairs: %d \n",c );
        // This Approach is Brute-force approach , it works correctly with time complexity of O(n log n)
        // and space complexity of O(1) ,
        // This approach can be more efficient,by using two pointer approach , and Hashmaps...

            }
}
