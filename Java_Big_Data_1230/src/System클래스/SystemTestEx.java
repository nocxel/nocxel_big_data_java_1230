package System클래스;

import static java.lang.Thread.sleep;

// 경과 시간 측정 하기
public class SystemTestEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;
        int val = (int)(Math.random() * 1000) + 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        long time1 = System.currentTimeMillis();  // 측정을 위해 시작 시간 가져옴
        for (int i = 0; i < data.length; i++) {
            cnt++;
            sleep(1);
            if (val == data[i]) {
                System.out.println("위치 : " + (i + 1));
                break;
            }
        }

        long time2 = System.currentTimeMillis(); // 종료 시간
        System.out.println("총 검색 횟수 : " + cnt);
        System.out.println("검색에 소요된 시간 : " + (time2 - time1) + "밀리 초");

        // 시스템 프로퍼티 읽기
        System.out.println(System.getProperty("os.name")); // os.name 키 값을 넣으면 해당 정보를 반환
        System.out.println(System.getProperty("user.name"));
    }
}
