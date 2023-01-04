package 타입변환;
// 타입 변환이란? 하나의 타입을 다른 타입으로 변경 하는 것
// 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해 주는 것
// 명시적 형변환 : 개발자가 원하는대로 변경하는 것
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 변경
// Double, parseSouble() : 문자열을 실수 타입으로 변경
// 진수 표현 : 16진수, 10진수, 8진수, 2진수


// System.in  입력이라 빠름
// System.out 출력이나 버퍼를 사용해서 조금 느림
// System.err : System.out과 유사하나 버퍼를 사용하지 않아서 더 빠르다. 하지만 다른 쪽에 변수를 넘겨줄 수 없다? (리다이렉션 X)

// println (int, char, float, long ... ) 다 자동으로 적용된다 왜?
// 오버로딩이 되어있어서 하나의 함수로 모든 형에 대해 자동으로 적용할 수 있게 만들어 놨다.



public class TypeEx1 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
        double rst1 = num1 / num2; // 문제가 발생하는 코드
        double rst2 = (double) num1 / num2; // 묵시적 형변환과 명시적 형변환 둘 다 적용된 모습
        double rst3 = num1 / (double) num2;
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);

        String phoneNumber = "01001001000";
        String name = "asd";


        int number = Integer.parseInt(phoneNumber);
        System.out.println(number);


        int var1 = 0b1010; // 2진수 = 10;
        int var2 = 0267; // 8진수 128+48+7 = 183
        int var3 = 399; // 10진수
        int var4 = 0x1F; // 16진수 31;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
