package 중첩인터페이스;

public class Button {
    OnClickListener listener;

    // 매개변수 다형성으로 외부에서 생성된 객체의 주소를 전달 받음
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }

    // 클래스 내부에서 인터페이스를 생성
    interface OnClickListener {
        void onClick();  // 추상메소드

    }
}
