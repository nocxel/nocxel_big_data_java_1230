package 다형성응용1;

import 상속이있는TV.ProtoTypeTV;

public class Product {
    int price;
    int bonusPoint;
}

class TV extends Product {
    TV() {
        this.price = 100;
        this.bonusPoint = 10;
    }
}

class Audio extends Product {
    Audio() {
        this.price = 120;
        this.bonusPoint = 12;
    }
}

class Computer extends Product {
    Computer() {
        this.price = 200;
        this.bonusPoint = 20;
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    void buy(Product p) {  // 각 제품에 대한 부모클래스 타입의 변수   다형성의 메리트를 알 수 있음 >> .buy(매개변수) 매개변수에 Product를 상속받는 모든(?) 제품가능)
        money -= p.price;  // 제품 구매시 제품 금액 만큼의 돈을 지불하는 코드
        bonusPoint += p.bonusPoint; // 제품 구매시 해당 포인트만큼 누적하는 코드
    }

    void viewInfo() {
        System.out.println("잔액 : " + money);
        System.out.println("포인트 : " + bonusPoint);
    }
}
