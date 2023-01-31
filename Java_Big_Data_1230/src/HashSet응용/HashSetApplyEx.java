package HashSet응용;

import java.util.*;

// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 1. 길이가 짧은 것 부터
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거
// ex) 13 but i wont hesitate no more no more it cannot wait im yours
// >>> i im it no but more wait wont yours cannot hesitate
public class HashSetApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 몇 개 입력? : ");
        int N = sc.nextInt();
        HashSet<String> wordSet = new HashSet<>();
        String[] words = new String[N];


        // set을 거쳐서 배열에 넣고 정렬하면 될까? 비효율적인가?
        String word = null;

        for (String e : wordSet) System.out.print(e+ " ");
        String[] wordArr = wordSet.toArray(new String[0]);
        Arrays.sort(wordArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 정렬 조건
                if (o1.length() > o2.length()) return 1;  // 앞에꺼가 길이가 길다 => 정렬해라!
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);      // 두번째가 사전순서상 앞에 있으면 양수 => 정렬해라
                    }
                }
                return -1;       // 현 상태 유지
            }
        });

        System.out.println(Arrays.toString(wordArr));
    }
}
