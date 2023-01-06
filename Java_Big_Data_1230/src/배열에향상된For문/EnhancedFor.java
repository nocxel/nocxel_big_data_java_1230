package 배열에향상된For문;
// 향상돈 for 문은 배열의 요소를 처음부터 끝까지 자동 순회
// 배열의 내부의 값을 변경 할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {50, 50, 50};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] += 10;
            sum += score[i];
        }

        System.out.println(sum);
        int[] score2 = {50,50,50};
        sum = 0;
        for (int e : score2) {  // score2 배열 안의 값은 변하지 않았음
            e += 10;
            sum += e;
            System.out.println(e);
        }
        System.out.println(sum);
    }
}
