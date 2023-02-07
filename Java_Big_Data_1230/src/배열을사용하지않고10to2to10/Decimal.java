package 배열을사용하지않고10to2to10;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        // Integer.parseInt 를 이용하면 너무 쉬운데?
//        int binaryNum = Integer.parseInt(Integer.toBinaryString(num));
//        int decimalNum = Integer.parseInt(String.valueOf(binaryNum), 2);
//
//        System.out.println(binaryNum);
//        System.out.println(decimalNum);
        System.out.println(solution(num));
        System.out.println(solution2(solution(num)));
    }

    public static int solution(int i) {
        int answer = 0;
        int cnt = 0;
        while (i > 0) {
            answer += (i % 2) * Math.pow(10,cnt);
            i = i / 2;
            cnt++;
        }
        return answer;
    }

    public static int solution2(int i) {
        int answer = 0;
        int cnt = 0;
        while (i > 0) {
            answer += (i % 10) * Math.pow(2, cnt);
            i = i / 10;
            cnt++;
        }
        return answer;
    }

}
