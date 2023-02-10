package 입출력예제2번;

import java.io.IOException;
import java.util.Scanner; // 두번째로 많이 사용되는 자바 API

// 콘솔 입력에 대해서
// System.in.read(): 키보드의 입력을 ASCII 코드값으로 읽어 들임
// 메인은 스택에서 맨 아래에 쌓인다.
// 즉, 맨 먼저 호출되지만 맨 마지막에 빠져나감
// 프로그램의 호출 구조는 스택
// 맨 나중에 올라간게 맨 처음으로 처리됨

// Scanner 입력 : 키보드의 입력을 원하는 데이터 타입으로 반환 받음




public class ScannerEx {
    public static void main(String[] args) throws IOException {
//        int cnt = 0;
//        while(cnt < 10) { //반복문
//            try {
//                int ketCode = System.in.read();
//                System.out.println("KeyCOde : " + ketCode);
//                if (ketCode == 'q') break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


        Scanner sc = new Scanner(System.in);
        // sc 지역변수로 stack 메모리에 잡힘 참조타입으로 메모리의 시작위치를 잡아줌
        // heap 메모리에 올라감 Scanner 크기만큼 (인스턴스)
        // static heap stack 메모리
        byte a = sc.nextByte(); // 키보드의 입력을 byte형으로 반환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // sc.next = 결과값 String >> .charAt(0) 0번쨰의 1개만 뽑아내라

        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음





    }

}
