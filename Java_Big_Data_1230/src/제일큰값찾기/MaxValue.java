package 제일큰값찾기;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세자리 정수를 입력 하세요");
        int number = sc.nextInt();
        int a = number / 100;
        int b = (number % 100) /10;
        int c = number % 10;
        if (a > b) {
            System.out.println(Math.max(a ,c));
        } else {
            System.out.println(Math.max(b, c));
        }

    }
}
