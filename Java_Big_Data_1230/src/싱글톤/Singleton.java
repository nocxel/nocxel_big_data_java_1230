package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();  // 클래스 내에서 객체 생성 static변수라서 1개만 singleton 생성
    private Singleton() {
        name = "test";
        id = 100;
    }

    // getSingleton() 메소드를 호출 시 반환 값으로 이미 만들어져 있는 싱글톤 객체의 참조 변수를 반환
    static Singleton getSingleton() {
        return singleton;
    }


}
