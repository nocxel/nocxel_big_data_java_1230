package 입출력예제1번;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "Queen";
        String address = "palace";
        char gender = '남';
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double aver = 0.0;

        // 자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("========== Java Style Output ===========");
        System.out.println();
        System.out.print("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("총점 : " + (kor + eng + mat));
        System.out.println("평균 : " + (double) (kor +eng + mat) / 3);
        // C언어 스타일(서식지정자 사용)
        // 서식지정자 : %d, %ld, %u, %f, %.2f, %s, %c, %%, %b
        // 이스케이프시퀀스 : \n, \r, \t, \b(백스페이스), \\
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", address);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double) (kor + eng + mat) / 3);
        System.out.println("apple\rbanana\tkiwi\b\b");

        //개행문자로의 작용
        System.out.println("\"Enter\" 키를 입력 하시면 종료 됩니다.");
        System.out.println("Hello\\Java");


        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * n; i++) {
            System.out.printf("%4d", i);
            if (i % n == 0) System.out.println();
        }








    }
}
