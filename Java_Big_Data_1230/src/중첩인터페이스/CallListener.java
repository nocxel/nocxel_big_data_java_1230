package 중첩인터페이스;

// 전화를 거는 버튼
public class CallListener implements Button.OnClickListener{

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
