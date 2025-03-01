package Array_string.StringQuestions;

public class DQNon_ConsecutivelyDuplis4 {
    public static void main(String[] args) {
        String s = "eraasWcbbwwwWW";
        boolean[] b = new boolean[s.length()];


        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (!b[i]) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        b[j] = true;

                    }
                }
                if (count == 1) {
                    System.out.print(s.charAt(i));
                } else if (count > 1) {
                    System.out.print(s.charAt(i) + "" + count);

                }


            }
        }
    }
}


