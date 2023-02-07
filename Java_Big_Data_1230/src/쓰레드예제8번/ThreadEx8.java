package 쓰레드예제8번;

import static java.lang.Thread.sleep;

// 데몬스레드 : 다른 스레드의 작업을 돕는 보조스레드 입니다. 다른 스레드가 모두 종료되면 자동으로 종료 됩니다.
// 스레드를 start()하기전에 setDaemon(true) 설정만 하면 됨
public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // 데몬스레드 설정 => 다른 스레드가 끝나면 같이 끝나는 스레드
        SimpleThread thread = new SimpleThread();
        autoSaveThread.start();
        thread.start();
        sleep(10000);

    }
}
class SimpleThread extends Thread { // 얘가 메인에서 실행되니까 메인쓰레드인가?
    @Override
    public void run() {
        try {
            sleep(20000);
        } catch (InterruptedException e) {
        }
        System.out.println("심플 스레드 끝");
    }
}
class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장 함");
    }
    @Override
    public void run() {
        while (true) {
            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }
}
