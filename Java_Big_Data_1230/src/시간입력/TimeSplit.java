package 시간입력;
// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초

import java.util.Scanner;

public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time;
        while (true) {
            System.out.print("시간을 입력해 주세요 (00:00:00) : ");
            time = sc.next();
            if (!isTime(time)) {
                System.out.println("잘못된 시간 표기 입니다");
            } else {
                int hour = Integer.parseInt(time.split(":")[0]);
                int min = Integer.parseInt(time.split(":")[1]);
                int sec = Integer.parseInt(time.split(":")[2]);

                System.out.printf("%s %02d시 %02d분 %02d초\n",
                        (hour > 12 ? "오후": "오전"),
                        (hour > 12 ? (hour - 12) : hour), min, sec);
                break;
            }
        }

    }

    // 입력받은게 time일 조건
    // : 을 2개 포함하고 있을 것
    // 0~23, 0~59, 0~59 의 숫자 범위를 만족할 것
    private static boolean isTime(String time) {
        int count = 0;
        int hour, min, sec;

        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == ':') {
                count++;
            }
        }

        if (count == 2) {
            hour = Integer.parseInt(time.split(":")[0]);
            min = Integer.parseInt(time.split(":")[1]);
            sec = Integer.parseInt(time.split(":")[2]);
            if (0 <= hour && hour < 24 && 0 <= min && min < 60 && 0 <= sec && sec < 60) {
                return true;
            }
        }
        return false;
    }
}

