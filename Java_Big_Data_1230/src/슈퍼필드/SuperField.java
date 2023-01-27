package 슈퍼필드;
// super : 자식 클래스가 부모클래스로 부터 상속 받은 필드(멤버)를 참조하는 변수
// super() : 부모 클래스의 생성자를 호출하는 메소드 입니다. (자식의 생성자 내에서 호출)
// 자식의 생성자에서 부모의 생성자를 호출 할 때는 반드시 부모의 생성자를 먼저 호출하고 다른 초기화를 진행해야한다.

// Q1 child. super. x  부모가 1개가 아닐수도 있지않나? 부모 상속 자식 상속 손자 ?

public class SuperField {
    public static void main(String[] args) {
        Child child = new Child();   // Child 객체 카리킴
        Baby baby = new Baby();

//        child.display(); // 출력 값 10 20  Parent a값으로 10으로 생성함 빈 생성자로 호출해줌
        baby.display();
        Parent parent = new Baby();
        parent.sing("ddd");

        // 부모의 생성자를 주석처리하면? 디폴트생성자를 불러줘야하는데 없어.... => 부모의 생성자는 꼭 있어야 한다!
        // 부모에 디폴트 생성자가 없다면 super(부모의 매개변수)로 생성해 줄수가 있다
        // 부모의 디폴트 생성자가 있으면 super()해도 되겠지 근데 없어도 디폴트로 받아온다 이말이지

        // print(b)만 있어서 자식클래스만 출력하면 되지만, 부모 클래스도 생성하고 온다


    }
}

class Parent {
    int a;
    Parent() {
        System.out.println("부모의 기본 생성자 호출");
        a = 10;
    }
    Parent(int n) {
        System.out.println("부모의 생성자 호출");
        a = n;
    }
    public void sing(String sing) {
        System.out.println(sing + sing);
    }

}

class Child extends Parent {
    int b;
    Child() {
        super(200);
        System.out.println("자식의 생성자 호출");
//        super(200);  super()는 다른 어떠한 작업보다도 먼저 해줘야함 자식생성자 부모생성자호출 다른 작업 순으로 하면됨
        b = 20;
    }
    Child(int n) {
        System.out.println("Child의 생성자 호출");
        b = n;
    }
    public void sing(String sing) {
        System.out.println(sing);
    }
    void display() {

        System.out.println(b);
    }
}

class Baby extends Child {
    int c;
    Baby() {
        super(10);
        System.out.println("baby 의 생성자 호출");
        c = 30;
    }

    public void sing(String sing) {
        System.out.println("옹알");
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
