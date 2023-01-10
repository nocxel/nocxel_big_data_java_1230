package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다.
// 0은 4칸, 1은 2칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 1칸의 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇 칸이 필요한지 출력
// 입력은 0이 들어 올때 까지 계속 반복 입력이 가능하게 해야 함.
// 계속 반복 입력을 하면 바로 뒤에 이어붙이는걸까? 아니면 다시 맨앞공백까지 2칸의 공백이 더해지는 걸까?
// 일단 입력을 따로 받는 거니까 2칸의 공백으로 넣었다.
public class SignBoardMake {
    public static int boardSize(int num) {
        int answer = 1;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') answer += 4;
            else if (numStr.charAt(i) == '1') answer += 2;
            else answer +=3;
            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("숫자를 입력하시오 : ");
            num = sc.nextInt(); // Int값으로 받는게 더 직관적일 것 같다. 숫자만 입력으로 받을 거니까 예외 처리가 쉽지않을까?
            if (num == 0) break;
            System.out.println(boardSize(num));
        }





    }
}
