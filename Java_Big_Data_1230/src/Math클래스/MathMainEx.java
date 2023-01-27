package Math클래스;

import java.util.Arrays;

// Math 클래스의 모든 메소드는 클래스 메소드 이므로 객체를 생성하지 않고 바로 사용 함.
// random() : 0.0 ~ 1.0 미만의 임의의 double 형 값을 생성해서 반환
// abs() : 절댓값
// floor() : 소수점 버림
// ceil() : 소수점 올림
// round() : 반올림

// 7자리의 로또 번호 생성하기
// 7개의 배열을 만들고 첫번째 부터 여섯번째는 0 ~ 50 사이의 임의의 수 생성 후 대입
// 마지막 7번째는 50 ~ 100사이의 임의의 수를 만들어서 대입하고, 한 번에 출력

public class MathMainEx {
    public static void main(String[] args) {
        int cnt = 0;
        int[] lotto = new int[7];
        Arrays.fill(lotto,101);
        int num;
        while (cnt<7) {
            if (cnt == 6) {
                num = 50 + (int) (Math.random() * 51);
            } else {
                num = (int) (Math.random() * 51);
            }

            if (isContain(num, lotto)) { // 배열에 숫자가 없다면
                lotto[cnt] = num;
                cnt++;
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
    // 배열에 숫자가 있으면 false 반환
    static boolean isContain(int num, int[] numArr) {
        for (int item : numArr) {
            if (num == item) return false;
        }
        return true;
    }
}
