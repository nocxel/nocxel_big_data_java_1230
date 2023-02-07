package 쓰레드예제6번;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        try{
            while (true) {
                System.out.println("쓰레드 실행 중..... ");
                sleep(1);       // sleep 이 탈출 조건이 될거야 에러를 캐치해서 나가야한다.
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생......");
        }
        System.out.println("종료를 위해 자원 정리 중...");
        System.out.println("실행 종료");

    }
}
