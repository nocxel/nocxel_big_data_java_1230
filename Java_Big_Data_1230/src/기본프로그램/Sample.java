package 기본프로그램; // 접근제한자(캡슐화)와 연관성이 있음



// 접근제한자: public, protected, default, private
/* 범위 주석
주석이란? 사람은 이해하고 컴파일러는 무시하는 영역
ctrl + /
디버깅할 때도 많이 쓰인다*/
public class Sample { // 클래스 이름을 지정, 클래스 이름은 관례상 대문자로 시작.
    // main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출 함.

    // {}: 클래스, 메소드 등의 범위를 결정
    // (): 메소드의 매개변수를 넣는 곳
    // []: 배열 등을 정의 할 때에 사용
    public static void main(String[] args) { // static: 정적메소드 => 메모리 할당 1개
        // void: 메소드 실행 이후의 반환 타입 중 하나. 반환하지 않아도 되는게 void 라고 보면 될 듯.
        System.out.println("Hello, Java!!!");

    }

}
