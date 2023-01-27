package 다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅이란? 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래의 자료형으로 변환하는 것
// instanceof : 형 변환 가능 여부를 확인하는 용도 (참조 변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {
    // ArrayList<참조형 wrapper클래스>
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();


    }

    public void addAnimal() {
        aniList.add(new Human()); // ArrayList 에 추가되면서 타입이 Animal 형으로 변환
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for (Animal e : aniList) e.move();
    }

    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) {
            Animal ani = aniList.get(i); // LIst의 해당 인덱스 값을 가져옴
            if (ani instanceof Human) { // Human 타입으로 형변환 가능 여부를 물어봄
                Human h  = (Human) ani;
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원 되지 않는 형 입니다.");
            }
         }
    }
}
