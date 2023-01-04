package 스위치문계산기;

import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산식을 입력하세요");
        int x = sc.nextInt();
        char op = sc.next().charAt(0);
        int y = sc.nextInt();
        switch (op) {
            case '+' : System.out.println("덧셈 : " + (x+y)); break;
            case '-' : System.out.println("뺄셈 : " + (x-y)); break;
            case '*' : System.out.println("곱셈 : " + (x*y)); break;
            case '/' :
                if (y == 0) {
                    System.out.println("0으로 못나눔");
                } else {
                    System.out.println("나눗셈 : " + (x/y));
                } break;
            case '%' :
                if (y == 0) {
                    System.out.println("0으로 못나눔");
                } else {
                    System.out.println("나머지 : " + (x%y));
                } break;
            default : System.out.println("연산자를 잘 못 입력 하셨습니다");
        }



    }
}
