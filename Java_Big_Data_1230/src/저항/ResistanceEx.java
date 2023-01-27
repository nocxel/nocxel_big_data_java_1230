package 저항;

import java.util.Scanner;

// 전자 제품에서는 저항이 들어 간다. 처음 색 2개는 저항의 값, 마지막은 곱해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0,1,2,3,4,5,6,7,8,9
// 곱 : 1, 10, 100, 1,000, 10,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력: yellow violet red
// 결과: 4,700
// 입력: orange red blue
// 결과: 32,000,000
// 입력: white white white
// 결과: 99,000,000,000
public class ResistanceEx {

    public static long solution(String inputs) {
        long answer = 0;
        final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        final int[] resistance = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        String[] input = inputs.split(" ");

        answer += indexOf(input[0], colors) * 10;
        answer += indexOf(input[1], colors);
        answer *= resistance[indexOf(input[2], colors)];
        return answer;
    }

    public static int indexOf(String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) return i;
        }
        return -1;
    }
    public static int indexOf(int num, int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            if (num == numArr[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputs = sc.nextLine();

        System.out.println(solution(inputs));

    }


}
