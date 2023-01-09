package 깊은복사얕은복사;
// 깊은 복사 : 할당된 메모리 공간에 실제 값이 복사 되는 것 (기본 타입 모두 여기에 해당 함)
// 얕은 복사 : 참조 타입에 해당되며 실제 값이 복사 되는 것이 아니라 주소가 복사되는 것을 말함.

public class DeapCopy {
    public static void main(String[] args) {
        int x = 100;
        int y;
        y = x;
        x = 200;
        System.out.println(y); // y = 100, 깊은 복사

        // 얕은 복사
        // a변수와 b변수가 메모리의 같은 영역을 가리키고 있다면
        // a변수로 값을 바꾸었을 떄, b의 값도 바뀌어버리는 경우가 생길 수 있다 이를 얕은 복사라 한다.

    }
}
