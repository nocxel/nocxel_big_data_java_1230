package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫쨰 줄에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어 있는 수가 주어짐 (0 ~ 10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
/*
3
1
7
99
321
777
0 -> 반복문에 대한 종료
결과
1 is not multiple of 3
7 is not multiple of 3
99 is a multiple of 3
321 is a multiple of 3
777 is a multiple of 3
 */
public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("n을 입력하시오 : ");
        int n = sc.nextInt();
        int num;
        while(true) {
            System.out.print("숫자를 입력해주세요 : ");
            num = sc.nextInt();
            if(num == 0) {
                System.out.println("종료합니다.");
                break;
            }
            numList.add(new Integer(num));
        }
        for (int item : numList) {
            if (item % n == 0) {
                System.out.printf("%d is a multiple of %d\n", item, n);
            } else {
                System.out.printf("%d is NOT a multiple of %d\n", item, n);
            }
        }
    }
}
