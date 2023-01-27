package 추상메소드;

public class AbstractMainEx2 {
    public static void main(String[] args) {
        Phone phone = new SmartPhone("Galaxy S22");    // 자식 클래스의 객체가 부모 클래스 타입으로 형변환 (업캐스팅)
        // 자식의 메소드는 사용할 수 없다.
        phone.setPower(true);  // 부모가 만든 메소드라 사용가능
        phone.call(); // 부모가 만들어달라고 한 걸 자식이 만든거라 사용가능
        //phone.internet();  // 자식이 독자적으로 만든거라 사용할수가없엉


    }
}
