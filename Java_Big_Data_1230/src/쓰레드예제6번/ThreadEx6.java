package 쓰레드예제6번;
// 스레드의 안전한 종료 방법은 stop 플래그를 구현하는 방법과 interrupt()메소드를 사용하는 방법이 있습니다.

import static java.lang.Thread.sleep;

public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(500);
//        runThread.setStop(true);
        InterruptThread intThread = new InterruptThread();
        intThread.start();
        sleep(10000);
        intThread.interrupt(); // 일시 정지 상태의 쓰레드에 Interrupt Exception 발생 시킴 Thread.interrupt

    }
}
