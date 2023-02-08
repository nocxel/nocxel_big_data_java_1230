package 블랙잭;

import java.util.Arrays;
import java.util.Scanner;

// 첫째줄 N, M
// 둘째줄 N 개의 정수
// 출력 : 3개의 합으로 M을 넘지 않으면서 가장 가깝게 구하기
public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        int max = 0;
        Loop1 :
        for (int i = 0; i < N-2; i++) {
            if (cards[i] > M) continue;
            Loop2 :
            for (int j = i+1; j < N-1; j++) {
                Loop3 :
                for (int k = j+1; k < N; k++) {
                    int sum = cards[i]+ cards[j] + cards[k];
                    if (sum == M) {
                        max = sum;

                    } else if (sum > max && sum < M) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);


        // for문을 쓰고 two pointer로 양쪽에서 조이는 건 어떨까? => 정확한 해를 구할 수 없을 것같네..



    }



}
