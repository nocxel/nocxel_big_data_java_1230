package 연산자연습1;

import java.util.Scanner;

// 이항연산자와 삼항연산자
// 산술연산자 : +, -, *, /, %
// 대입연산자 : 값을 변수에 대입할 떄 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : +=, -=, *=, /=, %=
// 증감연산자 : 값을 1증가하거나 감소 시키는 연산자 (단항 연산자) --, ++,
// 비교연산자 : 값의 크기를 비교하는 연산자
// 논리 연산자 : and &&, or ||, NOT !, XOR ^
// 삼항 연산자 : 항이 3개인 연산자 (이건 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args) {
        int num1 = 27, num2 = 0;
        System.out.println("+ 연산자" + (num1 + num2));
        System.out.println("- 연산자" + (num1 - num2));
        System.out.println("* 연산자" + (num1 * num2));
//        System.out.println("/ 연산자" + ((double)num1 / num2));
//        System.out.println("% 연산자" + (num1 % num2));

        try {
            System.out.println(num1 % num2);
        } catch (ArithmeticException e) {
            System.out.println("값을 0으로 나누면 안됩니다.");
        }


        num1 = 10;
        System.out.println(num1+=2); // num1 = num1 + 2;
        System.out.println(num1-=2);
        System.out.println(num1*=2);
        System.out.println(num1/=2);
        System.out.println(num1%=2);

        num1 = 0;
        System.out.println(num1++); // 출력하고 증가시킴 0이 출력되고 값은 1
        System.out.println(num1--); // 1을 출력하고 값은 0
        System.out.println(++num1); // 증가시키고 출력 1을 출력하고 값도 1
        System.out.println(--num1); // 감소시켜서 0출력


        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true: false;

        System.out.println(isAdult);


        System.out.println("Java" + (123+12.02));


    }
}