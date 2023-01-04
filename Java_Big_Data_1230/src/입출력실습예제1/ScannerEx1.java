package 입출력실습예제1;
// 이름, 주소, 성별, 나이, 전화번호를 입력받아 출력 해보기

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.next();
        sc.nextLine(); // 남아있는 버퍼를 버린다ㅇ
        System.out.println("주소지를 입력해주세요\n 입력: ");
        String address = sc.nextLine();

        System.out.println("성별을 입력해주세요 (M/F)");
        char gender = sc.next().charAt(0);

        System.out.println("나이를 입력해주세요 (만) : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("전화번호를 입력해주세요 : ");
        String phoneNumber = sc.nextLine();

        System.out.println(name + "\n" + address  + "\n" + gender  + "\n" + age  + "\n" + phoneNumber);


    }
}
