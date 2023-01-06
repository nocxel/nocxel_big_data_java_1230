package 상근날드;
// 상근날드 가게에서는 세트 메뉴를 판매합니다.
// 햄버거는 3개 종류가 있고
// 음료는 2가지 종류가 있습니다


import java.util.Scanner;

// 입력은 총 5개의 값을 연속으로 입력 하는 데 햄버거 3가지 음료 2가지를 연속으로 입력
// [햄버거, 햄버거, 햄버거, 음료, 음료]
// 햄버거3가지 중 가장 싼 메뉴 선택, 음료 2중 가장 싼 것 선택하고 세트 메뉴이기 떄문에 50원 할인 해줍니다.
// 총 세트 메뉴의 금액 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        int minBugger = Integer.MAX_VALUE;
        int minBeverage = Integer.MAX_VALUE;
        int[] menu = new int[5];
        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        int price;
        while (true) {
            System.out.println("가격을 입력해 주세요");
            price = sc.nextInt();
            if (price < 0) {
                System.out.println("다시 입력해 주세요");
            } else {
                menu[cnt] = price;
                cnt ++;
            }
            if (cnt >= menu.length) break;
        }

        for (int i = 0; i < menu.length; i++) {
            if (i < 3 && minBugger > menu[i]) minBugger = menu[i];
            else if (i >= 3 && minBeverage > menu[i]) minBeverage = menu[i];
        }
        System.out.println(minBugger + minBeverage - 50);



    }
}
