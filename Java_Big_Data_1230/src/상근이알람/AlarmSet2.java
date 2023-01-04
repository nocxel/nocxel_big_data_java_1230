package 상근이알람;

import java.util.Scanner;

public class AlarmSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
            minute += hour * 60;
            if (minute < 45) {
                minute = 60 * 24 - 45 + minute;
            } else {
                minute -= 45;
            }
            hour = minute / 60;
            minute = minute % 60;
            System.out.printf("%02d시% 02d분으로 알람이 설정되었습니다", hour, minute);
            break;
        }
    }
}
