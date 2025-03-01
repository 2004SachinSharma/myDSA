package Array_string.StringQuestions;

public class CQConsecutively_duplicates3 {
    public static void main(String[] args) {

        String str = "aaabbbcddd";
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for ( int i = 1; i<str.length(); i++){
            if( str.charAt(i) == str.charAt(i-1)){
                c++;
            }else{
                sb.append(str.charAt(i-1)).append(c);
               c=1;

            }
        }
       sb.append(str.charAt(str.length()-1)).append(c);
       System.out.println(sb);
    }
}