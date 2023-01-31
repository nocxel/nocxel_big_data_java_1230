package X보다작은수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력
public class LessThanEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        System.out.print("정수는 몇 개? : ");
        int N = sc.nextInt();
        System.out.print("몇 이하를 출력 할까요? :");
        int x = sc.nextInt();
        for (int i = 0; i < N; i++) {
            numList.add(sc.nextInt());
            if (numList.get(i) < x) System.out.print(numList.get(i) + " ");
        }
        int[] numArr = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};

        for (int item : numArr) {
            numList.add(item);
        }

    }

}
