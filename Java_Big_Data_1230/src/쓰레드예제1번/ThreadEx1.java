package 쓰레드예제1번;
// 멀티스레드란? 하나의 프로그램에서 여러가지 일을 동시에 수행 하는 것

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread test = new TestThread();
        test.start();   // start() 메소드를 호출하면 작업 스레드가 run() 메소드를 실행시킴
        

    }
}
// 스레드를 만드는 방법은 Thread 클래스를 상속받는 방법이 이음 (별로 좋은 방법은 아님)
class TestThread extends Thread {
    @Override
    public void run() { // run메소드를 작성했음
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합계 : " + sum);
    }

}
