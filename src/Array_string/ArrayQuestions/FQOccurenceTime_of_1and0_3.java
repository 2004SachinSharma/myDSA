package Array_string.ArrayQuestions;
 // counting no. of occurence of 0 and 1
public class FQOccurenceTime_of_1and0_3
{
    public static void main(String[] args) {
        int[] arr = { 1,0,1,0,1,0,0,1,1,0,1};

        int count0 = 0;
        int count1 = 0;
        for( int ar :arr){
            if(ar == 0 ) {
                count0++;
            } else{
                count1++;
            }
        }

        System.out.println("The count of 0 is :" + count0);
        System.out.println("The count of 1 is :" + count1);


    }
}
