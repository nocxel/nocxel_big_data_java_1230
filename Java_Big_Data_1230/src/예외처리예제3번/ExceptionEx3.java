package 예외처리예제3번;
// NullPointerException : 참조하고 있는 주소를 접근 했을 때, 값이 없는 경우
// null 값을 대입할 수 없는 설정이 자바는 안됨 (새로나온 언어는 되는 경우 있음 swift 등)

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try {
            String testStr = test.name;
            System.out.println(test);
        } catch (NullPointerException e) {
            System.out.println("참조하고 있는 곳에 값이 없습니다.");
        }
    }
}
