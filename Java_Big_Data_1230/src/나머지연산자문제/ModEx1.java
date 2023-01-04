package 나머지연산자문제;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 3개의 변수에 대입하기
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("0 ~ 999 까지의 정수를 입력해 주세요");
        int num = sc.nextInt();


            if (num > 999 || num < 0) {
                System.out.println("오류");
            } else {
                int c = num % 10;
                int b = num % 100 / 10;
                int a = num / 100;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
                break;
            }
        }



    }

}
