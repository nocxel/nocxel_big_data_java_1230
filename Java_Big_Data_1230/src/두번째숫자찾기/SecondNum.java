package 두번째숫자찾기;

import java.util.Scanner;

// 임의의 숫자 10개를 입력 받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기
public class SecondNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자들을 입력해주세요");
        String[] numbers = sc.nextLine().split(" ");
        int[] numArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numArr[i] = Integer.parseInt(numbers[i]);
        }
        System.out.print("찾을 수 : ");
        int findNum = sc.nextInt();
        System.out.println("결과 : " + secondFind(numArr, findNum));


    }
    public static int secondFind(int[] numArr, int findNum) {
        int cnt = 0;
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] == findNum) {
                cnt++;
            }
            if (cnt == 2) {
                return (i+1);
            }
        }
        return -1;

    }
}
