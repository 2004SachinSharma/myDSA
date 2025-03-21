package Array_string.StringQuestions;

import java.util.Arrays;

public class GQreverseAnString7 {
    public static void main(String[] args) {
        String str = "I Love CFS";
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + (i > 0 ? " " : "")); // handling by not giving extra space at the end of reversed String array
        }


        System.out.print("\nwhen don't want to use the split method");
        StringBuilder builder = new StringBuilder();
        int end = str.length();
        System.out.println();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                builder.append(str.substring(i + 1, end)).append(" ");
                end = i;
            }
        }
        if (end > 0) {
            builder.append(str.substring(0, end));
        }System.out.print(builder);
        
    }
}

//------------------------------------Done_Line---------------------------------------------------