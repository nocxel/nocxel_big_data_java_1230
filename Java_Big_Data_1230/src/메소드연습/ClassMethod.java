package 메소드연습;
// 메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대/소문자, _, $, 숫자 사용 가능 ) 숫자는 맨 앞에 올 수 없음
// camel 표기법 사용
// 접근제한자 반환타입 메소드이름(매개변수 목록) { 구현부, return}

import java.util.Scanner;

public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample();

        Scanner sc = new Scanner(System.in);
        System.out.println("정수값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1, n2);
        int rst2 = sample.sum(1,3,5,78,1,2,3,4,5);
        System.out.println(rst);
        System.out.println(rst2);
        sample.say();  // say() 메소드를 호출하기 위해서는 클래스를 객체로 만들고 객체의 메소드로 접근
        System.out.println(sample.sayStr());
        sample.getName();




    }


}
