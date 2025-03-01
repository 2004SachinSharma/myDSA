package Array_string.StringQuestions;

public class AQVowels1 {
    public static void main(String[] args) {

 // no of a,e,i,o,u each in any String:
        String str = "Sachin ";
                int a = 0,e = 0, i = 0, o = 0, u = 0;
                String vowels = "aeiou";

        for (int ii = 0; ii < str.length(); ii++) {

            if (str.charAt(ii) == 'a') {  // switch case is better approach then this !
                            a += 1;
            }  else if (str.charAt(ii) == 'e') {
                e +=1;
            }  else if (str.charAt(ii) == 'i') {
                i += 1;
            }  else if (str.charAt(ii) == 'o') {
                o += 1;
            }  else if ( str.charAt(ii)== 'u'){
                u += 1;
            }


        }

        System.out.println("a "+a);
        System.out.println("e "+e);
        System.out.println("i "+i);
        System.out.println("o "+o);
        System.out.println("u "+u);

        System.out.println("My another approach : No cheating done by me only...");
        // though I don't cheat , and look at solution that easily , all the questions except 1 or 2 , till now across all the array and String Question till here , I just looked for the hint in 1 or maximum 2 questions out of 9
        //apart from it , I have done on my understanding only!
        // I just wrote here , for no reason
            for ( int j = 0 ; j < vowels.length() ; j++ ){
                int gino = 0 ;
                for ( int i2 = 0; i2< str.length() ; i2++){
                if(vowels.charAt(j) == str.charAt(i2) ){
                      gino++;
                }
                }
                System.out.printf(" %s %d\n ", vowels.charAt(j), gino);
        }


    }
}
