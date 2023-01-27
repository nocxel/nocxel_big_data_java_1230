package 단어공부;

import java.util.Arrays;
import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분 하지 않음
// 가장 많이 등장하는 알파벳이 여러개라면 ? 출력
public class WordStudy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while(true) {
            int[] count = new int['Z' - 'A' + 1]; // count 배열 초기화
            System.out.print("word입력 : ");
            str = sc.next();
            if (str.equals("exit")) break;  // 탈출문
            str = str.toUpperCase(); // 일단 입력을 다 UPPERCASE로 바꿔버리자
            for (char item : str.toCharArray()) {
                count[item-'A']++;  // for문을 돌면서 알파벳에 해당하는 count배열의 값을 증가시킴.
            }

            // count 배열에서 가장 높은 값을 출력 해야함
            // 0과 1에 대한 비교값으로 maxIdx, secIdx 초기값 설정
            int maxIdx = count[0] <= count[1] ? 1 : 0;
            int secIdx = count[0] <= count[1] ? 0 : 1;

            for (int i = 2; i < count.length; i++) {
                if (count[maxIdx] <= count[i]) {  // <= 를 사용하여 값이 같을 때에도 진행시킨다 ( < 만쓰면 ? secIdx 의미가 없음)
                    secIdx = maxIdx;  // 두번쨰로 많이 등장한거에 maxIdx 값을 놔두고
                    maxIdx = i;       // maxIdx에 i를 넣어준다.
                }
            }

            if (count[secIdx] == count[maxIdx]) System.out.println('?'); // ? 조건
            else System.out.println((char)(maxIdx + 'A'));
            System.out.println(solution(str));


        }
    }
    // 다른방법으로 left max index와 right max index를 비교해서 ? 출력
    static char solution(String str) { // 함수로 만드려했는데 생각보다 이중 for나 if가 없어 간단해 보인다.
        char answer;
        int[] count = new int['Z' - 'A' + 1];
        str = str.toUpperCase(); // 대문자로 변경
        // 'A' = 65, 'Z' = 90
        for (char item : str.toCharArray()) {
            count[item-'A']++;  // for문을 돌면서 알파벳에 해당하는 count배열의 값을 증가시킴.
        }
        int lIdx = 0;  // 왼쪽으로 부터 최대값 index
        int rIdx = count.length - 1; // 오른쪽으로 부터 최대값 index
        for (int i = 0; i < count.length; i++) { //왼쪽에서 진행
            if (count[lIdx] < count[i]) lIdx = i;       // lIdx에 i를 넣어준다.
            if (count[rIdx] < count[count.length - i - 1]) rIdx = count.length - i - 1;
        }

        if (rIdx == lIdx) return (char)(Math.max(rIdx, lIdx) + 'A');
        else return '?';




    }

}
