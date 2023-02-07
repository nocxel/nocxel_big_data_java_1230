package 더하기싸이클;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 0 ~ 99 정수
// 10보다 작으면 앞에 0붙여서 2자리 만듬
// 각 자리수 더한다
// 원래 수의 오른쪽 숫자와 더한 값의 오른쪽 숫자를 이어붙여 새로운 수를 만든다.
public class AddCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자 입력 받기
        int first = sc.nextInt();
        System.out.println(solution(first));

        // 번외 가장 큰 싸이클 = 60
        // 싸이클길이 60, 20, 12, 4, 3  5종류 싸이클이 있네요
        // 각각 최소 값은 1, 2, 13, 26, 5 ex) 5 > 55 > 50 > 5

    }
    public static int oneCycle(int i) { // 1사이클 구현
        if (i < 10) { // 10보다 작으면 11배의 값이 됨
            return 11 * i;
        } else {
            // 원래 수의 오른쪽 숫자 == (i % 10)
            // 두 자릿 수 합 = (i/10) + (i % 10)
            // 두 자릿 수 합의 오른쪽 숫자 == ((i / 10) + (i % 10)) % 10

            // 이어 붙이기 (i % 10) * 10 + (((i / 10) + (i % 10)) % 10)
            return (i % 10) * 10 + (((i / 10) + (i % 10)) % 10);
        }
    }
    public static int solution(int first) {
        int cnt = 0;
        int result = first;
        // 처음에 그냥 한번 실행해 놓고 cnt = 1로 설정 해도 되지만
        // 한번 실행하고 조건에 따라 반복하는 do while 문을 써보자
        do {
            result = oneCycle(result);
            cnt++;
        } while (first != result);
        return cnt;
    }
}

