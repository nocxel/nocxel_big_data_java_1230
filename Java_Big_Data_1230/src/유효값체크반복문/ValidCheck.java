package 유효값체크반복문;

import java.util.Scanner;

// 반복문을 이용해서 유효값 체크 하기
public class ValidCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        boolean isFirst = true;
//        while (true) {
//            System.out.print("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if (age > 0 && age < 200) break;
//            System.out.println("나이를 잘 못 입력하셨습니다.");
//        }
//        System.out.println("입력 하신 나이는 " + age +"살 입니다.");

        do {
            if(!isFirst) System.out.println("나이를 잘 못 입력 하셨습니다.");
            System.out.println("나이를 입력하세요");
            age = sc.nextInt();
            isFirst = false;
        } while (age <= 0 || age >= 200);

        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}
