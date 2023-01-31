package HashMap기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값으로 구성되어 있음, 키의 중복 여부 확인은 HashCode()를 통해서 수행 함
// 키의 중복은 허용하지 않음, 값은 중복 가능, 순서를 유지하지 않음
// 경우에 따라서 hashCode()와 equals() 메소드를 오버라이드 해서 사용해야 함.
// HashMap은 성능이 우수하고 멀티스레드 환경을 지원하지 않음(즉 동기화 기능 없음)
// HashTable은 HashMap과 내부 구조가 동일하며, 멀티스레드 지원
// Propertie는 HashTable을 상속 받아서 기능을 제약하여 사용(키와 값이 모두 문자열로만 구성), 정보를 파일에 저장하고 읽기 위한 도구
public class HashMapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 추가 : put(키, 값)
        map.put("Americano", 2500);
        map.put("Latte", 4500);
        // 객체 찾기 : get(키) 변환값으로 값이 넘어 옴
        System.out.println("값 읽기 : "  + map.get("Latte"));
        System.out.println("값 읽기 : " + map.get("Latte2"));
        // 객체 삭제 : remove(키) 삭제가 정상적으로 되면 값이 넘어 옴
        System.out.println("값 제거 : " + map.remove("Latte"));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("AAA", 999);
        map2.put("BBB", 888);
        map2.put("BBB", 777);    // 키가 같아서 나중의 값으로 대체함
        System.out.println("총 Entry 수 : " + map2.size());

        // 객체 찾기
        System.out.println(map2.get("AAA"));

        // map을 순회하는 방법 : 향상된 for 문
        for(String key : map.keySet()) {    // 모든 key를 set에 담아서 리턴
            System.out.println(key + " : " + map.get(key));
        }

        // 반복자로 순회하는 방법(iterator)
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {// 키가 존재하는지 확인
            String key = iterator.next();
            System.out.println(key + " : " + map.get(key));
        }
//        Iterator의 장점
//        1. 컬렉션에서 요소를 제어하는 기능
//        2. next() 및 previous()를 써서 앞뒤로 이동하는 기능
//        3. hasNext()를 써서 더 많은 요소가 있는지 확인하는 기능
//        링크드 리스트와 연계하면 더 좋게 쓸 수 있겠구나

        // 객체 삭제
        map2.remove("AAA"); // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수 : " + map2.size());

        // 값을 수정하는 메소드
        map2.replace("BBB", 555);
        map2.replace("CCC", 444);
        for(String key : map2.keySet()) {    // 모든 key를 set에 담아서 리턴
            System.out.println(key + " : " + map2.get(key));
        }





    }

}
