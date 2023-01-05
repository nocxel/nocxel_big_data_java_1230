package 중첩반복문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%2d X%2d = %2d, ", i, j, (i*j));
            }
            System.out.println("\b\b");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("별의 갯수를 입력 하세요 :");
//        int number = sc.nextInt();
//        for (int i = 0; i < number; i++) {
//            System.out.printf("|%d| ", i);
//            for (int j = 0; j <number; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//

    }
}
