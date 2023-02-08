package 소수단어;

import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.nextLine();
        if (isPrime(strToInt(word))) {
            System.out.println("It is a prime word");
        } else {
            System.out.println("It is not a prime word");
        }


    }

    public static int strToInt(String word) {
        int result = 0;
        for (char ch : word.toCharArray()) {
            if ('a' <= ch && ch <='z') {
                result += ch - 'a' + 1;
            } else if('A' <= ch && ch <= 'Z') {
                result += ch - 'A' + 27;
            }
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.ceil(Math.pow(num,0.5)) ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
