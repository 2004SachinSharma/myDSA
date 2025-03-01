package Array_string.StringQuestions;

public class EQpalindrome5 {
    public static void main(String[] args) {
        String s = "";
        int count = 0;

        if (s.length() > 1) {
            for (int i = 0; i < s.length() / 2; i++) {

                if (s.charAt(i) == s.charAt(s.length() - (i + 1))) {

                    count++;

                }

            }


            if (count == s.length() / 2) {

                System.out.println("Yes!ThisStringIsPalindrome!");

            } else {

                System.out.println("No!ThisStringIsNotPalindrome!");

            }


        } else if (s.isEmpty()) {
            System.out.println("String is Empty mere bhai!");
        } else {
            System.out.println("AapneEkHiValueDaliH_2_Value_daliye!");
        }
    }
}
