package 제네릭일반;


import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입 체크 / 자바 8 이전 대비 변경 사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {
        List list = new ArrayList(); // 자바 8 이전 스타일
        list.add("안녕");
        String str = (String) list.get(0);  // 옛날 문법  => 타입을 안정하고 값을 넣을 수 있는데 나중에 에러가 뜬다이말이야..
        // 제네릭 타입
        List<String> list1 = new ArrayList<>(); // 자바 11부터 뒤에 ArrayList<String> 은 안넣어도됨
        list1.add("hello");
        String str1 = list1.get(0);



    }
}
