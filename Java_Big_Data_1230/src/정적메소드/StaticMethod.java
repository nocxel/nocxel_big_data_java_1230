package 정적메소드;


import static 정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank NH = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); // 정적메소드이며, 클래스 소속

        System.out.println("현재 시간을 출력합니다");
        System.out.println(Util.getCurrentDate("yyyyMMdd-hhmmss"));
        // 객체를 사용하지않고 메소드를 사용하는 방법  스테틱으로 만들어버려서 불러다가 쓰기만하면 된다.
        System.out.println(DOMAIN);

    }
}
