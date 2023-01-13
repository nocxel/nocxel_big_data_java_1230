package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

// 상속을 받기 위해서는 extends
// Animal 클래스로부터 상속받아 Dog 클래스에는 아무것도 없지만
// Animal의 setName을 사용할 수 있다.
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "잠을 잡니다");
    }
}

class HouseDog extends Dog {
    @Override // 어노테이션  오버라이딩할 때, 메서드의 이름을 잘못적는 실수를 방지해준다
    void sleep() {
        System.out.println(name + "집에서 잠을 잡니다");
    }

    // 오버로딩 관계가 성립함.
    void sleep(int time) {
        System.out.println(name + "가 " + time +"동안 " +"집에서 잠을 잡니다");
    }
}
