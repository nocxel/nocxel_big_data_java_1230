package 스트링토큰;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우 구분자 기준으로 문자열을 관리할 수 있음
// countTokens() : 남아있는 토큰 수
// hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인 boolean
// nextToken() : 토큰을 하나씩 꺼내 옴
public class TokenTestEx {
    public static void main(String[] args) {
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 : ");
        String name = sc.nextLine(); // 입력받기

        String[] nameStr = name.split("/");
        for (String e : nameStr) System.out.print(e + " ");
//        StringTokenizer st = new StringTokenizer(name, "/"); // 배열과 구분자를 객체 생성 시 넣어줌
//        String[] nameStr = new String[st.countTokens()]; // 토큰의 개수 만큼 배열 생성
//
//        while (st.hasMoreTokens()) {       // 남아 있는 토큰이 있으면 진행
//            nameStr[idx++] = st.nextToken(); // 현재 토큰을 꺼내서 배열에 담음
//        }
//        for (String e : nameStr) System.out.print(e + " ");

    }
}
