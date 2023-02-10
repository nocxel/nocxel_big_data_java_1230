package 구간합;
// 첫째 줄에 수의 개수 N, 합을 구해야 하는 횟수 M
// 둘째 줄에는 N개의 수

import java.util.Scanner;


public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 구간합 배열 만들기
        for (int i = 1; i < N; i++) {
            arr[i] += arr[i - 1];
        }
        int preIdx;
        int postIdx;


        for (int i = 0; i < M; i++) {
            preIdx = sc.nextInt();
            postIdx = sc.nextInt();
            if (preIdx == 1) {
                System.out.println(arr[postIdx - 1]);
            } else {
                System.out.println(arr[postIdx - 1] - arr[preIdx - 2]);
            }
        }
    }
}
