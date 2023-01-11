package 영화표예매;

import java.util.Arrays;
import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드 필요
// 좌석을 예매하는 메소드가 필요
// 판매딘 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
    boolean[] seat = new boolean[10];
    int cost = 0;

    // 현재 좌석 상태를 보여주는 메소드 0 이면 [ ]. 1이면 [v]
    void printSeat() {
        String[] seatStr = new String[10];
        for (int i = 0; i < seat.length; i++) {
            if (seat[i]) seatStr[i] = "[v]";
            else seatStr[i] = "[ ]";}
        System.out.println("===================== screen =====================");
        System.out.println(Arrays.toString(seatStr));
    }

    // 좌석을 예약하는 메소드
    void selectSeat() {
        this.printSeat(); // 현재 상태를 보여줌
        int seatNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번 좌석을 예약하시겠습니까? : ");
        seatNum = sc.nextInt();

        if (seatNum > seat.length || seatNum < 0) System.out.println("잘못된 번호입니다");
        else if (seat[seatNum - 1]) System.out.println("이미 예약된 자리 입니다");
        else {
            seat[seatNum - 1] = true;
            System.out.println("예약완료되었습니다");
            this.printSeat();
            this.cost += 12000;
        }
        System.out.println();
    }

    // 좌석예약을 종료하는 메소드
    void exit() {
        System.out.printf("총 판매금액은 %d 입니다", cost);
    }
}
