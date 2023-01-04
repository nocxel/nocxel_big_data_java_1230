package 비트연산자;

import java.util.function.BinaryOperator;

// 비트 연산자: 비트 단위로 연산을 수행 (0,1)
// & (비트 AND) : 두 개의 비트가 모두 1이면 1
// | (비트 OR) : 두 개의 비트 중 1이 있으면 1
// ^ (XOR) : 두 개의 비트의 값이 같으면 1
// ~ (비트의 값을 반전) : 비트가 0이면 1, 비트가 1이면 0;
// << (Shift 연산자) : 지정된 수 만큼 왼쪽으로 비트를 이동 시킴
// >>               : 지정된 수 만큼 오른쪽으로 비트를 이동 시킴
public class BItOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        System.out.println("10 = " + Integer.toBinaryString(num1));
        System.out.println("12 = " + Integer.toBinaryString(num2));
        System.out.println();

        System.out.println("AND 연산");
        System.out.println(Integer.toBinaryString(num1 & num2));
        System.out.println();

        System.out.println("OR 연산");
        System.out.println(Integer.toBinaryString(num1 | num2));
        System.out.println();

        System.out.println("XOR 연산");
        System.out.println(Integer.toBinaryString(num1 ^ num2));
        System.out.println();

        System.out.println("~ 연산");
        System.out.println(Integer.toBinaryString(~ num1));
        System.out.println(~num1);
        System.out.println(Integer.toBinaryString(~ num2));
        System.out.println(~num2);
        System.out.println();

        System.out.println("<< 연산");
        System.out.println(Integer.toBinaryString(num1 << 1 ));
        System.out.println(num1 << 1);
        System.out.println(">> 연산");
        System.out.println(Integer.toBinaryString(num2 >> 1));
        System.out.println(num2 >> 1);
    }
}
