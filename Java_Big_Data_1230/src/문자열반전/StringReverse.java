package 문자열반전;

import java.util.Scanner;

// abcdefg => gfedcba
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요");
        String str = sc.next();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        char[] chars = str.toCharArray();
        char tmp = 0;
        for (int i = 0; i < chars.length / 2; i++) {
            tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
        }
        str = String.valueOf(chars);
        System.out.println(str);

    }
}
