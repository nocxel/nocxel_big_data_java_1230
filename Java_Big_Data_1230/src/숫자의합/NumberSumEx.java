package 숫자의합;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        while(true) {
            sum = 0;
            String str = sc.nextLine();
            if (str.equals("0000")) break;
            for (char ch : str.toCharArray()) {
                sum += (ch - '0');
            }
            System.out.println(sum);
        }
    }
}
