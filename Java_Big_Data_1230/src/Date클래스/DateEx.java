package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date() : 1970년 1월 1일 0시 0분 0초에서 현재까지의 경과시간 (msec), 객체를 생성 후 사용
// SimpleDateFormat : 운영체제로 부터 얻어진 시간 정보를 우리가 원하는 포멧으로 변경에서 출력(pattern 매칭을 사용)
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
        // yyyy : 연도를 4자리로
        // yy : 연도를 2자리로
        // MM : 월을 2자리로
        // dd : 일을 2자리로
        // hh : 12시간법
        // HH : 24시간법
        // mm : 분을 2자리로
        // ss : 초
        // W : 월에서 몇 번째 주
        // w : 연에서 몇 번째 주

        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7, f8;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("yy년 MM월 dd일");
        f5 = new SimpleDateFormat("MM월 dd일 HH시 mm분");
        f6 = new SimpleDateFormat("HH:mm:ss");
        f7 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f8 = new SimpleDateFormat("오늘은 yy년의 w주차 입니다.");

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));
        System.out.println(f8.format(now));


    }
}
