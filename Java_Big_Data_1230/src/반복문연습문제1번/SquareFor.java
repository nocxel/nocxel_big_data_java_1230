package 반복문연습문제1번;
// 양의 정수 n을 받아서 n * n 크기의 행렬을 출력하는 프로그램을 작성
// 값은 1부터 시작
// EX) 정수 값: 4
// 1  2  3  4
// 5  6  7  8
// 9 10 11 12
//13 14 15 16

import java.util.Arrays;
import java.util.Scanner;

public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("숫자가 0보다 작습니다.");
            } else {
                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < num; j++) {
                        System.out.printf("%2d\t", i * num + j + 1);
                    }
                    System.out.println();
                }
                break;
            }



        }

    }
}
