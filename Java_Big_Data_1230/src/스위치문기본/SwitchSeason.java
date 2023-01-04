package 스위치문기본;

import java.util.Scanner;

// 스위치문은 조건문이며, 스위치에는 조건식은 올 수 없고 조건에 대한 변수만 올 수 있음
// 변수는 정수, 문자, 문자열만 사용 가능
// 스위치의 각 케이스를 끝내기 위해서는 반드시 break문이 필요
// 해당하는 케이스가 없는 경우를 위해 default 문이 필요
public class SwitchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계절을 입력해주세요");
        String season = sc.next(); // 공백기준으로 문자열을 입력 받음
        switch (season) {
            case "spring" :
            case "SPRING" :
                System.out.println("꽃 피는 봄");
                break;
            case "summer" :
            case "SUMMER" :
                System.out.println("더운 여름");
                break;
            case "fall" :
            case "FALL" :
            case "autumn" :
            case "AUTUMN" :
                System.out.println("좋은 가을");
                break;
            case "winter" :
            case "WINTER" :
                System.out.println("추운 겨울");
                break;
            default :
                System.out.println("계절을 잘 못 입력하셨습니다");

            break;
        }
    }
}
