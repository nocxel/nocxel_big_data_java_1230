package 다형성기본;

// 부모 / 자식1, 자식2, 자식3     내가 만든게 어떤 자식으로 결합해야하는지 몰라 => 대처하기위해 느슨한 결합
// 부모가 접근할 수 있으니까 부모클래스 참조변수로 무수히 많은 결합 가능 (동적 바인딩)
// 추상화는? 부모에서 선언만하고 구현을 안하면 자식에서 상속을 하면서 메소드이름이 남아있으니 만들어주면 추상화가 되는 것

public class ParentPoly {
    protected int num;  // protected 접근제한자는 동일한 패키지와 상속관계에서 접근을 허용
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}

class ChildPoly extends ParentPoly {
    private int x = 100;
    public ChildPoly() {}
    public void out() { // 해당 메소드는 부모가 가지지 않는 메소드
        System.out.println("부모의 protected");
        System.out.println("자식 클래스의 메소드");
    }
    @Override // 해당 메소드가 오버라이딩 관계인지를 컴파일러가 문법 체크를 해주도록 설계
    public void display() {
        System.out.println("상속받아 재정의한 메소드");
    }
}