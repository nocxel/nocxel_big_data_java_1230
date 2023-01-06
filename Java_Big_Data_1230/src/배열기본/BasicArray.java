package 배열기본;

import java.io.ObjectStreamClass;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = new int[3]; // 타입[] 참조변수 = new 타입[크기] : 배열 생성  초기값 0으로 다 채워줌
        score[0] = 90;
        score[1] = 80;
        score[2] = 60;
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
        System.out.printf("%.2f" , (double)sum/score.length);


    }
}
