package 인터페이스활용;

import javax.swing.plaf.SliderUI;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        Buy buyer = customer; // Customer Type의 customer 참조변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형 변환)
//        buyer.buy(); // buyer는 Buy 인터페이스의 메소드만 호출 가능
//
//
//        Sell sell = customer;
//        sell.sell();
//
//        Customer customer1 = (Customer) sell; // 다시 역으로 형변환
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order(); //  재정의 된 메소드가 호출 됨

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
