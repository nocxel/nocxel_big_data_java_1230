package 배열로로또번호생성;

import java.util.Arrays;

// 1 ~ 45 사이의 임의의 수 6개로 구성
// 1. 배열로 로또 번호를 생성해 출력 하기
// 2. 배열로 로또 번호 생성 (중복 제거)
// 3. 다른 자료구조를 사용해 로또 번호 만들기
public class RandomLotto {
    public static void main(String[] args) {
        int[] lottoNumber = new int[6];
        int cnt = 0;
        int num;

        while (true) {
            num = (int)((Math.random() * 45) + 1);
            if (!contain(lottoNumber, num)) {
                lottoNumber[cnt] = num;
                cnt++;
            }
            if (cnt > 5) {
                break;
            }
        }

        Arrays.sort(lottoNumber);
        System.out.println(Arrays.toString(lottoNumber));

    }

    // 중복 제거 메소드
    public static boolean contain(int[] number, int num) {
        for (int item : number) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }



}
