package Calendar클래스;

import java.util.Calendar;

// Calendar 클래시는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이 하기 때문
// 정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴.

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Date now = new Date() 와 달리 객체를 생성할 필요가 없음
        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH) + 1);
        System.out.println(now.get(Calendar.DAY_OF_WEEK));   // 요일
        System.out.println(now.get(Calendar.DAY_OF_MONTH));  // 일
        System.out.println(now.get(Calendar.AM_PM));   // 오후면 1
        System.out.println(now.get(Calendar.HOUR_OF_DAY));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));

        // yyyy 년 MM월 dd일 HH시 mm분 ss초 포멧팅을 해봐라
        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
                now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1,
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.HOUR),
                now.get(Calendar.MINUTE), now.get(Calendar.SECOND));



    }
}
