package 대소문자변경;

import java.util.Scanner;

// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤, 대문자는 소문자로 소문자는 대문자로 변경하기
// char는 정수값을 가지기 때문에 (ASCII) +, - 연산과 <, > 의 비교연산이 가능하다 하지만 다시 (char)형으로 변환해주어야한다
// char[] 배열을 만들면 자동으로 char로 변환된다.
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String str = sc.next();
        char[] chars = str.toCharArray();
        String answer = "";
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z') { // 소문자라면
                chars[i] +=  ('A' - 'a');
            } else if ('A' <= chars[i] && chars[i] <= 'Z') { // 대문자라면
                chars[i] += ('a' - 'A');
            }
        }
        str = String.valueOf(chars);
        System.out.println(str);


    }
    UpperLowerChange ch = new UpperLowerChange();

}
