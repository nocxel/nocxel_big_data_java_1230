package 입출력스트림연습문제;
// 1. 적절한 위치에 이름과 성적 파일 생성
// 2. FileInputStream 으로 생성된 파일을 읽기 위한 스트림 생성
// 3. 파일을 스캐너로 읽어 들어가기 위해 스캐너 생성하고 스캐너의 입력으로 스트림 연결
// 4. 스캐너의 hasNextLine() 메소드를 이용해 읽을 라인이 있는 동안 반복 수행
// 5. 스캐너의 nextLine()으로 라인별로 문자열을 읽어 들임
// 6. 입력 받은 문자열을 split(" ")을 이용해 공백 기준으로 자르고 이를 문자열 배열에 대입
// 7. 첫번쨰 요소는 문자열이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
// 8. ts.add(new 클래스()); 생성자에 이름과 변환된 정수값을 대입
// 9. 향상된 for문을 순회하면서 결과 출력

// 1. 이름과 3개의 성적을 객체 단위로 관리하기 위해 클래스 생성하고 정렬을 위해 Comparable을 상속받거나 Comparator이용
// 2. 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름 순으로) 에 대한 정렬 조건 구현

import com.sun.source.tree.Tree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class InOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Java_Big_Data_1230/src/입출력스트림연습문제/score.txt");
        Scanner sc = new Scanner(fis);
        TreeSet<Score> ts = new TreeSet<>();
        String[] data = new String[4];
        while (sc.hasNextLine()) {
            data = sc.nextLine().split(" ");
            String name = data[0];
            int korean = Integer.parseInt(data[1]);
            int english = Integer.parseInt(data[2]);
            int math = Integer.parseInt(data[3]);
            ts.add(new Score(name, korean, english, math));
        }

        for (Score e: ts) {
            System.out.println("이름 : " + e.getName() + " 총점 : " + (e.getKorean()+e.getEnglish()+e.getMath()));
        }



    }

}
