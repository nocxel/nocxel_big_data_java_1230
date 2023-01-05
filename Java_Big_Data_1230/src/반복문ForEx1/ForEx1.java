package 반복문ForEx1;

import java.util.Scanner;

// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간 }
// for문 하나에 ;이 많다. 명령문이 3개
// while문 도 명령이 3개 이상이다.
// for 과 while의 차이는 없다 for는 while문을 한줄에 다 넣어놓은 것 뿐
public class ForEx1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);
        }
        // 극한의 압축이 가능하다고
//        int j = 1; // 초기식
//        for(;;) {
//            System.out.printf("%4d", j);
//            if(j % 10 == 0) System.out.println(); // 조건식
//            if(j == 100) break;
//            j++; // 증감식
//        }
//        int i = 1;
//        while(true) {
//            System.out.printf("%4d" , i);
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//            i++;
//        }
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);


    }
    // 재귀함수
    public static int recursiveFunc(int n) {
        if (n == 1) return 1;
        return n + recursiveFunc(n - 1);
    }

}
