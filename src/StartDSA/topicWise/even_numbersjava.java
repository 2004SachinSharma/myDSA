package StartDSA.topicWise;

import java.util.Arrays;

public class even_numbersjava {
    public static void main(String[] args) {


        System.out.println(even_numbersjava.findNumbersMethod1(new int[] {232, 2223, 110, 212117, 12, 3}));
        System.out.println(even_numbersjava.findNumbersMethod2(new int[] {232, 2223, 110, 212117, 12, 3}));
        System.out.println(even_numbersjava.findNumbersMethod3(new int[] {232, 2223, 110, 212117, 12, 3}));



    }
    //----------------------------------------------------------


    public static int findNumbersMethod1(int[] nums) {

        int evenCounter = 0;
        for(int arr: nums){
            int n = arr;

            if((n >= 10 && n <= 99) || (n >= 1000 && n <= 9999) || (n >= 100000 && n <= 999999) ){
                evenCounter++;
            }
        }

        return evenCounter;
    }

    //----------------------------------------------------------


    public static int findNumbersMethod2(int[] nums) {

        int evenCounter = 0;
        for(int arr: nums){
            int n = String.valueOf(arr).length();

            if(n%2 == 0){
                evenCounter++;
            }

        }

        return evenCounter;
    }


//----------------------------------------------------------
    public boolean func(int n ){

        int digitCounts = 0;


        while(n!=0){
            n = n/10;
            digitCounts++;
        }
        return digitCounts%2 == 0;


    }


    public static int findNumbersMethod3(int[] nums) {

        even_numbersjava e = new even_numbersjava();

        int n = 0;
        int evenCounter =0;
        while(n < nums.length){

            if(e.func(nums[n])){
                evenCounter++;
            }

            n++;

        }

        return evenCounter;

    }


}

