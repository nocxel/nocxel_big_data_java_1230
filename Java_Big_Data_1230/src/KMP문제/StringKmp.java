package KMP문제;

import java.nio.Buffer;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/*
KMP 알고리즘이 KMP인 이유는 이를 만든 사람의 성이 K,M,P 이기 때문이다
성이 들어간 알고리즘을 두 가지 형태로 부른다.
1. 첫 번쨰는 성을 모두 쓰고, 이를 하이폰으로 이어 붙인 것이다 ex) Knuth-Morris-Pratt  이를 긴 형태라고 부른다
2. 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르느 것이다. ex) KMP

동혁이는 매일매일 자신의 일을 메모장에 기록해놓는다
그런데 긴 형태와 짧은 형태를 섞어서 적어 놓은 것을 발견했다.
긴 형태로 계속 기록하면 메모장 가격이 부담되므로 모두 짧은 형태로 기록하려고 한다.
긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램 작성
 */
public class StringKmp {
    public static String solution(String name) {
        String answer = "";
        if (name.contains("-")) {
            String[] names = name.split("-");
            for (String item : names) {
                answer += (item.substring(0,1).toUpperCase());
            }
        } else {
            answer = name;
        }
        return answer;
    }
    public static String solution2(String names) {
        String answer = "";
        char[] chars = names.toCharArray();
        for (char e : chars) {
            if ('A' <= e && e <= 'Z') {
                answer += e;
            }
        }
        return answer;
    }
    public static String solution3(String names) {
        String answer = names.substring(0,1);
        for (int i = 0; i < names.length()-1; i++) {
            if (names.charAt(i) == '-') {
                answer += names.charAt(i+1);
            }
        }
        return answer;
    }
    public static String solution4(String names) {
        String answer = "";
        char e;
        for (int i = 0; i < names.length(); i++) {
            e = names.charAt(i);
            if ('A' <= e && e <= 'Z') {
                answer += e;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요");
        String str = sc.next();
        System.out.println(solution(str));
        System.out.println(solution2(str));
        System.out.println(solution3(str));
        System.out.println(solution4(str));


    }
}
