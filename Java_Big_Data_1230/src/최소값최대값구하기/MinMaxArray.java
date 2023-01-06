package 최소값최대값구하기;

import java.util.Scanner;

// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1, 3, 5, 7, 2, 4, 10, 10, 20, 15
// MIN : 1
// MAX : 20
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[10];
        int cnt = 0;
        int tmp = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.printf("%d번쨰 정수를 입력해주세요", (cnt + 1));
            intArr[cnt] = sc.nextInt();
            if (max < intArr[cnt]) max = intArr[cnt];
            if (min > intArr[cnt]) min = intArr[cnt];
            cnt++;
            if (cnt >= intArr.length) break;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
