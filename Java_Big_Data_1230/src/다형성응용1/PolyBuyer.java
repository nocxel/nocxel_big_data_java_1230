package 다형성응용1;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();

        buyer.buy(audio);
        // Product를 상속받은 클래스는 다 매개변수가 될 수 있음 다형성이 없으면 한가지의 객체타입만 매개변수로 쓸 수 있을것이다.

    }
}
