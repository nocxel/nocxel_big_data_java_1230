package 문자열연결;


import java.util.Scanner;

// 문자열 추가하기
// 첫번째 문자열 : seoul
// 두번째 문자열 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 잘라, 두번째 문자열 앞에 추가하기
// ulkorea
// 3을 입력하면 oulkorea
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first, second;
        int tmp;
        while (true) {
            System.out.print("첫번째 문자열 입력 : ");
            first = sc.next();
            System.out.print("두번째 문자열 입력 : ");
            second = sc.next();
            System.out.printf("얼마나 잘라올까요? (0 ~ %d) : ", first.length());
            tmp = sc.nextInt();
            if (tmp > first.length() || tmp < 0) {
                System.out.println("입력하신 숫자만큼 문자열을 자를 수 업습니다");
            } else if (tmp == 0) {
                System.out.println(second);
                break;
            } else {
                System.out.println(first.substring(first.length() - tmp) + second);
                break;
            }
        }

    }
}
