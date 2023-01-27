package 평균은넘겠지;

import java.util.Arrays;
import java.util.Scanner;

// 이중 for문 싫어!!
public class OverAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        String[] scores;
        for (int i = 0; i < C; i++) {
            System.out.println("점수입력");
            sc.next();
            scores = sc.nextLine().trim().split(" ");
            System.out.printf("평균넘는사람 비율 %.3f%%입니다", overAver(scores,average(scores)));
            System.out.println();

        }

    }
    public static double average(String[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += Integer.parseInt(scores[i]);
        }
        return sum / scores.length;
    }

    public static double overAver (String[] scores, double aver) {
        int cnt = 0;
        for (int i = 0; i < scores.length; i++) {
            if (Integer.parseInt(scores[i]) > aver) {
                cnt++;
            }
        }
        return (double) cnt / scores.length * 100;
    }
}

