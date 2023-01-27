package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
// 사용이유 : 메모리의 효율성 증대와 데이터 공유에서 이점이 있음
// 단점 : 구현이 까다로움, 데이터의 무결성이 깨질수 있음(멀티쓰레드에서 사용시 synchronize(동기화)가 필요)
public class SingletonMain {
    public static void main(String[] args) {
//        // Singleton singleton = new Singleton();  // private로 외부에서 객체 생성을 막아버림 new생성안됨
//        // 그럼 어떻게 쓸까??
//        Singleton singleton1 = Singleton.getSingleton();  // Singleton 클래스 메소드를 불러와서 사용
//        Singleton singleton2 = Singleton.getSingleton();
//
//        if (singleton2 == singleton1) {// 참조하는 주소가 같은지 체크 (스택영역비교)
//            System.out.println("같은 싱글톤 객체를 참조 합니다");
//        } else {
//            System.out.println("다른 싱글톤 객체를 참조 합니다.");
//        }
//        singleton1.id = 999;
//        singleton1.name = "곰돌이";
//
//        System.out.println(singleton1.id);
//        System.out.println(singleton1.name);
//        System.out.println(singleton2.id);
//        System.out.println(singleton2.name);
//        // 하나라도 바뀌면 같이 바뀜  => 같은 객체를 가리키고 있기때문에

        ReferenceTest1 ref1 = new ReferenceTest1();
        ReferenceTest2 ref2 = new ReferenceTest2();
        ref1.setInfo("안유진", 21);
        // ref1을 변경했는데 2도 바뀜
        ref2.viewInfo();

    }
}
