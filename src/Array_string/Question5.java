package Array_string;



public class Question5 {


    public static void main(String[] args) {

        int arr [] = {2,6,3,7,3,1,6,4,7,23,63,3};
        boolean visited [] = new boolean[arr.length];
        System.out.printf("The size of an array is: %d and occurences are : \n", arr.length);
        for( int i = 0; i < arr.length; i++) {
            int count = 0;
            if (!visited[i]){
            for (int j = 0; j < arr.length; j++ ) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[i] = true; // Mark this duplicate as counted
                }
            }
            }
            System.out.printf("The number %d occured for %d times\n", arr[i], count );
        }






    }

}

