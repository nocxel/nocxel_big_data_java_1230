package 진수변경;
// 8진수 수를 2진수로 바꿔라 333,334자를 넘지 않는다? 바운더리 에러가 날 것
// 10진법으로 핻도 30만자리가 나올텐데
// Integer.toOc 이나 Integer.toBinary로는 만들 수 없다.
// 8 은 2진법으로 1000이다
// 30만자를 연산하는건 좀...
// String으로 받아서 자릿 수 1개당 3자리 할당해서 줘야겠는데....
// String에 계속 추가하는건 비효율적이니까 buffer를 쓰자
// 첫자리는 어떻게 할까나..? 첫째자리 들어갈때만 조건을 두거나 decimal format을 쓰자

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EIghtToTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num8 = sc.next();

        String[] octalToBinary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        long beforeTime = System.currentTimeMillis();
        StringBuffer result = new StringBuffer();
        for(char ch : num8.toCharArray()) { // 30만칸의 배열이란;;; 하지만 배열의 한계치가 훨씬 크다!!
            // ch는 0~7까지 char형의 숫자다. '0'을 뺴서 인덱스에 넣겠다.
            result.append(octalToBinary[ch-'0']);
        }
        String df = new DecimalFormat("0").format(new BigDecimal(result.toString()));
        System.out.println(df);
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
