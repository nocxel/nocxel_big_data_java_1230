package Arrays클래스;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있습니다.
// binarySearch() : 이진 탐색 알고리즘 제공
// sort() : 기본적인 오름차순, 그리고 매개변수를 이용해 내림차순, 그리고 오버라이딩 통한 직접 구현
// toString() : 배열의 요소를 문자열로 출력
// asList() : 일반 배열을 ArrayList로 변환
// 배열의 개수 입력, 찾을 수 입력
public class ArraysTestEx {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,3,5,7,9,245,136,54};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;  // 뒤에꺼가 크면 자리를 그대로 냅둔다 => 큰 게 뒤로 간다
                else return 1;
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
