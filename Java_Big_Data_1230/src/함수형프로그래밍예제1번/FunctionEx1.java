package 함수형프로그래밍예제1번;
// 함수형 프로그래밍이란 : 자바 8에서 도입, 수학공식과 유사, 불변성의 원칙, 조건문, 반복문 사용 금지 등으 ㅣ특징을 가짐
// 람다(Lamda) : 화살표 표현식으로 사용 됩니다. 생략 가능한 모든 것을 생략하는 것을 기본원칙으로 합니다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 함수형 인터페이스가 필요 합니다.

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);

//    String name(String a, String b);   함수형 인터페이스에 2개 메소드가 들어가면? A의 람다식이 안됨 인터페이스는 껍데기다.
}
@FunctionalInterface
interface MyFuncInterface {
    void method(int x);
}
@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); //  반환 타입을 결정했음
}
class MyCalculator implements Calculator { // 인터페이스 상속받아서 sum 구현 해줘야함
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class FunctionEx1 {
    public static void main(String[] args) {
        Calculator mc = (a, b) -> a + b; // ----------------- A  MyCalculator 클래스에 메소드를 넣지않고도 람다식으로 바로 처리


        MyFuncInterface mf = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        MyFuncInterface2 mf2 = (x,y) -> x < y ? x : y;
        System.out.println(mf2.min(3,4)); // min이 뭔지 정의 하지않았지.. 자바의 추론으로 람다식에서 설정해준거다.
    }
}
