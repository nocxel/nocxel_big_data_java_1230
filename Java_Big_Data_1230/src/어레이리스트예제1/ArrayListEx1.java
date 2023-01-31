package 어레이리스트예제1;
// List 인터페이스란? 배열과 비슷한 구조를 가지며 하위에 ArrayList, LinkedList, vector 클래스를로 구성됨
// 요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정 안해도 됨), 다양한 메소드 제공
// ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입,삭제는 느림 (맨 뒤 삽입,삭제는 빠름)
// Vector : ArrayList와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 떄문에 안정적이나 ArrayList보다 느림
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입/삭제가 매우 빠름, 검색은 느림

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        String[] data = {"138", "145", "122", "155"};
        List<String> pitches = new ArrayList<>(Arrays.asList(data));
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("138");
//        pitches.add(1,"155"); // 해당 인덱스에 값 추가 (성능에 영향을 미침)
        System.out.println(pitches);
        System.out.println(pitches.get(3)); // 인덱스 값을 반환함
        // System.out.println(pitches.get(5)); // 인덱스 초과 에러 예외 발생함 (예외처리에서 죽지 않게 할 수 있음)
        System.out.println(pitches.size()); // ArrayList의 개수 반환
        System.out.println(pitches.contains("142")); // ArrayList에 전달된 값이 있는지 확인
        System.out.println(pitches.remove(0)); // 해당 인덱스 값 삭제 / 삭제 된 요소를 반환함
        System.out.println(pitches.remove("144")); // 해당 오브젝트 삭제 / 삭제 되면 true, 안되면 false 반환
        pitches.sort(Comparator.reverseOrder()); // 내림 차순 정렬
        pitches.sort(Comparator.naturalOrder()); // 오름 차순 정렬




    }
}
