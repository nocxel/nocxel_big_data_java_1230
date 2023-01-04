package 조건문연습문제1;

import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("점수를 입력해 주세요 (0~ 100)");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("잘못입력하셨습니다");
            } else {
                if (score > 90) System.out.println("A학점입니다.");
                else if (score > 80) System.out.println("B학점입니다.");
                else if (score > 70) System.out.println("C학점입니다.");
                else if (score > 60) System.out.println("D학점입니다.");
                else System.out.println("F학점입니다.");
                break;
            }


        }
    }
}
