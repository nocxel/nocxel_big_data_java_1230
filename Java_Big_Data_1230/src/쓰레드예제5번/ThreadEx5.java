package 쓰레드예제5번;
// 스레드 간의 협업 : wait(), notify(), notifyAll()
// wait() : 현재의 스레드를 일시 정지 상태로 만듬
// notify() : 대기 상태에 있는 스레드를 실행 대기 상태로 만듬
// notifyAll() : 일시 정지된 모든 스레드를 실행 대기로 만듬

public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject();
        ThreadA thA = new ThreadA(shareObject);
        ThreadB thB = new ThreadB(shareObject);
        thA.start();
        thB.start();
    }
}
