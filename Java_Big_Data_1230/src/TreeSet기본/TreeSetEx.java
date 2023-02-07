package TreeSet기본;
// TreeSet : 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장함
// 루트 노드가 딱 중간 값이라서 또 옆에 부모노드는 3/4지점이겠고... => 데이터를 추가하거나 제거하는 것이 빠르다.
// 중위 순회를 하면 오름차순된 결과를 얻을 수 있다
// 중위 순회 : (Left - Root - right =>

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23); ts.add(10); ts.add(48);
        ts.add(15); ts.add(7); ts.add(22);
        ts.add(56);

        for (int e : ts) System.out.print(e + " ");

        // remove();
        ts.remove(40);

        // iterator() : 컬렉션의 요소 제어에 용이
        Iterator<Integer> iter = ts.iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");

        // size()
        System.out.println("트리 사이즈 : " + ts.size());

        // subset() : 메소드의 부분 집합의 출력
        System.out.println(ts.subSet(10,15));  // 10이상 15미만의 요소 출력


        // first() : 정렬된 순서에서 첫 번째 객체 반환
        // last() : 마지막 객체
        // lower(Object o) : 지정된 객체보다 작은 객체 중 가장 가까운 객체 반환, 없으면 null
        // higher(Object o) : 큰 객체중 가장 가까운 큰 객체 반환, 없으면 null


        // 정렬
        // descendingSet() : treeSet을 역순으로 반환
        // headSet(Object toElement) : 작은 값들 반환
        // tailSet(Object toElement) : 큰 값들을 반환
        // subSet(Object frontElement, Object toElement) : 범위 검색

        HashSet<Integer> set = new HashSet<>();
        // set.first();  hashSet은 순서를 보장하지 않는다
    }
}
