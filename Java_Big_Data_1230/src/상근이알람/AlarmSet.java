package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각한다.
// 창영이라는 친구는 상근이에게 지각하지 않는 방법을 알려줍니다
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
// 03으로 입력하면??

public class AlarmSet {
    public static void main(String[] args) {
        // 입력받으면 45분 깍아서 출력
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("몇 시에 알람을 해드릴까요? (0~23) : ");
            int hour = sc.nextInt();
            if (hour < 0 || hour > 23) {
                System.out.println("다시 시간을 입력해주세요");
                continue;
            }
            System.out.print("몇 분에 알람을 해드릴까요? (0~59) : ");
            int minute = sc.nextInt();
            if (minute <0 || minute > 59) {
                System.out.println("다시 시간을 입력해주세요");
                continue;
            }
            if (minute >= 45) { // 시간이 안바뀌는 경우
                minute -= 45;
            } else {            // 시간이 바뀌는 경우
                minute += 15;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }
            }
            System.out.printf("%02d시% 02d분으로 알람이 설정되었습니다", hour, minute);
            break;
        }
    }
}



