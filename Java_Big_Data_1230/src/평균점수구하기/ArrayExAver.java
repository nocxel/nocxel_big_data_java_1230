package 평균점수구하기;

import java.util.Arrays;
import java.util.Scanner;

// 상현이가 가르치는 학생은 총 다섯 명이다 (안유진, 유나, 채원, 카즈하, 장원영)
// 기말고사를 치고 난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정 해줌
// 모든 학생이 보충학습을 들음
// 총 수강생의 평균을 구하는 프로그램 작성 5명중 40점 안되는 학생 성적을 40점으로 만들어준다 그다음 평균을 구한다
public class ArrayExAver {
    public static void main(String[] args) {
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int num;
        double aver = 0.0;
        while (true) {
            System.out.println("점수를 입력해 주세요 : ");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("다시 입력해 주세요");
            } else {
                if (num < 40) {
                    score[cnt] = 40;
                } else {
                    score[cnt] = num;
                }
                aver += (double) score[cnt] / score.length;
                cnt ++;
            }
            if (cnt >= score.length) break;
        }
        System.out.println(Arrays.toString(score));
        System.out.println(aver);

    }

}
