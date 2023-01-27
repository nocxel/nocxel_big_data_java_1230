package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결할 네트워크를 선택 하세요 [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                adapter = new WiFi("KT Megapass");
                break;
            case 2:
                adapter = new FiveG("SK Telecom");
                break;
            case 3:
                adapter = new LTE("LG U+");
                break;
            default:
                System.out.println("네트워크를 잘 못 선택하셨습니다");

        }
        adapter.connect(); // nullpointexception 에러가 날 수 있는 경우가 있다. 스위치문을 통과하면서 값이 안 들어갈 수 있으니까

    }
}
