package 클래스기본;
// 클래스 이름 참조변수 = new 클래스이름();

public class BasicClass {
    public static void main(String[] args) {
        Car gv80 = new Car("GV80", "red", "2023.01",230);
        Car santafe = new Car("Santafe", "Gray", "2023.01", 210); // 클래스로 객체 생성
        gv80.setName("GV80 Sports");
        gv80.setColor("Yellow");
        gv80.viewCar();
        santafe.viewCar();

    }
}

// 접근제한자가 default인 클래스 생성
class Car {
    // 정적 메소드는 한 개만 만들어짐
    static String manufacture = "현대자동차"; // 클래스 변수 (넓은 의미에서 필드이다.)
    String name;   // 인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 갯수만큼 생성 됨
    String color; // 인스턴스 변수 (필드)
    String productYear;
    int maxSpeed;
    // 생성자 : 클래스 이름과 동일하고 반환 타입 없다. void 조차 없다.
    // 생성자는 주로 객체 생성 시 객체 내부의 필드를 초기화하는데 사용한다.
    // 필드는 생성자의 매개변수로 전달 된다. (객체를 생성다ㅏ
    Car(String name, String color, String year, int speed) {
        this.name = name;  // 전달받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 this를 적어야 함
        this.color = color;
        productYear = year;
        maxSpeed = speed;
    }
    Car() {}; // 생성자가 없을 때의 경우
    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void viewCar() {
        System.out.println("제조사 : " + manufacture);
        System.out.println("차종 : " + name);
        System.out.println("색상 : " + color);
        System.out.println("출고연도 : " + productYear);
        System.out.println("최고속도 : " + maxSpeed);
        System.out.println("======================");
    }
}