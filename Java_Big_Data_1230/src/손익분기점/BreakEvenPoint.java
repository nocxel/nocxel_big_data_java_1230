package 손익분기점;
// 초기 비용 A, 생산 비용 B, 판매 비용 C
// 손익분기점이 나는 판매량을 출력하라
// ex) 1000 70 170 => 10대를 팔면 0, 11대를 팔면 100의 이익이 나므로 11출력
// C-B로 A를 나눈값을 소숫점 버림하고 + 1하면 되겠다.
public class BreakEvenPoint {
    public static int BEP(int A, int B, int C) {
        if (C < B) return -1;
        else {
            return (int) Math.floor((double) A / (C-B)) + 1;

        }
    }

    public static void main(String[] args) {
        System.out.println(BEP(1000, 70, 170));
        System.out.println(BEP(1000,70, 150));
        System.out.println();

    }
}
