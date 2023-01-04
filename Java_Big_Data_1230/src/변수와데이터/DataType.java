package 변수와데이터;

public class DataType {
    public static void main(String[] args) {
        byte num1 = 127;  // byte -128 ~ 127
        byte num2 = -128;
        num1 +=1;
        num2 --;
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("=====double=====");
        double double1 = 0.1;
        for (int i = 0; i < 1000; i++) {
            double1 += 0.1;
        }
        System.out.println(double1);
        // 결과값: 100.09999999999859  실수는 근사치로 나온다
        // 실수의 계산은 컴퓨터에 많이 부하를 준다

        System.out.println("=====int=====");
        int age = 27; // 정수값을 지정할 수 있는 age라는 변수를 선언
        System.out.println(age);;

        int n1, n2;
        double n3  = 3.14;
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시 " + minute + "분");
        NameCard nameCard = new NameCard();
        nameCard.address = "주소";
        nameCard.age = 30;
        nameCard.name = "미라클";
        nameCard.eMail = "email@email.mail";
        nameCard.phoneNumber = "010-0100-1000";


    }
}
class NameCard {
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;

}
