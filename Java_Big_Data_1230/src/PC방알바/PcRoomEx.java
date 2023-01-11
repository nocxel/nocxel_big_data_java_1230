package PC방알바;

import java.util.Arrays;
import java.util.Scanner;

// PC방에 PC가 100대 있음
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶어 하는 자리에 다른 손님이 있으면 거절을 해야하고 아니면 사용 허가
// 손님의 수 입력 : 3
// 각 손님의 희망 자리 번호 입력
// 자리 번호 : 1 1 3 3 5 => 2 (거절 횟수)
public class PcRoomEx {
    public static void main(String[] args) {
        boolean[] seat = new boolean[100];
        int rejectCnt = 0;
        int seatNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("손님 수 입력 : ");
        int customer = sc.nextInt();
        System.out.println("몇 번 자리를 희망하시나요?");

        for (int i = 0; i < customer; i++) {
            seatNum = sc.nextInt();
            if (seat[seatNum - 1]) {
                rejectCnt++;
            } else {
                seat[seatNum - 1] = true;
            }
        }

        System.out.println(rejectCnt);



    }
}
