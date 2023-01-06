package 참조타입확인;
// 참조타입 = 객체?
// Stack 영역
// 기본 자료형 (int, double, byte, long, boolean 등) 지역변수나 참조영역의 참조값이 할당됨.
// int a = 10  => 스택메모리에 정수값을 할당할 수 있는 a라는 이름으로 메모리 공간이 생기고 안에 10값이 들어감
// String str = "10"  => 스택메모리에 str이름으로 인스턴스(주소값)을 가지게됨 => 힙의 주소를 가리키며 힙 영역의 인스턴스 주소에 "10"값이 있음

// Heap 영역
// 참조타입: 객체를 생성해서 주소값을 스택 영역에 가짐. 스택영역의 주소값을 참조해서 힙영역에 할당된 값 가리킴
// 메모리 크기에 제한이 없고
// 프로그램에 필요한 개체의 개수나 크기를 알 수 없을 떄 사용가능합니다.
// => class사용하면 a.a, a.b 처럼 많은 속성값을 가지게 됨 => 당연히 메모리적으로 한계가 없어야 하는게 맞고
// 개수나 크기를 정확히 몰라도 마음대로 편집할 수 있는것임
// 그렇기 때문에 잘 관리를 해야겠죠?

// 기본자료형을 객체로 만들려면? Wrapper class
// 프로그램에 따라 기본 타입의 데이터를 객체로 취급해야만 하는 경우가 있다.
// 메소드의 인수로 객체 타입만이 요구되면, 기본타입의 데이터를 그대로 사용할 수 없음
// 기본 타입의 데이터를 객체로 포장해주는 클래스 Wrapper
// Byte, Short, Integer, Long, Float, Double, Character, Boolean 앞이 대문자인 것들!! String은 그냥 객체타입임
// 클래스도 똑같이 대문자로 시작하죠




public class RefType {
    public static void main(String[] args) {
        int x = 0; //
        String str = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
        int[] intArray = null;
        // 참조타입의 값을 비교하려면?
        // == : 스택영역의 값이 같냐는 뜻
        // equals : 실제값이 같은지 비교하는 함수
        String name1 = "a";
        String name2 = "a"; // 힙 메모리에 이미 "a"값이 들어가 있음 => name2를 스택에 할당하면서 "a"있는 힙의 주소에 넣어줌.
        // name1 = "b" 로 바꾸면? name1 을 "b"가 들어있는 주소로 재할당;
        // new는 Heap메모리에 새로운 영역을 할당받아 생성한다.
        String name3 = new String("a");
        String name4 = new String("b");
        String name5 = "b";                         // 늦게 생성했지만 new로 생성한 name4와는 다른 주소를 가리킨다
        System.out.println(name1==name2); // true
        System.out.println(name4 == name5); // false;

        System.out.println(name1.equals(name2)); // true

    }
}
