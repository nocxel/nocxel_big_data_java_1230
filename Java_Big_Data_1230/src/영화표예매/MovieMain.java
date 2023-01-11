package 영화표예매;
// 영화 표 예매하기 클래스를 만들고 객체 생성
// 극장의 좌석은 10개임 (10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석 당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현재 좌석의 예약 상태를 보여주고 예약을 받음
// 종료는 판매된 좌석의 개수를 확인해서 판매 금액을 구함

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket movieticket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        int menu;

        while(true) { // 예약은 종료하기를 누르기전까지는 계속 진행해야함.
            System.out.print("1.예매 2.조회 0.종료\n 메뉴를 선택하세요 : ");
            menu = sc.nextInt();
            if (menu == 0) {
                movieticket.exit();
                break;
            }
            if (menu == 1) {
                movieticket.selectSeat();
            }
            if (menu == 2) {
                movieticket.printSeat();
            }


        }
    }
}
