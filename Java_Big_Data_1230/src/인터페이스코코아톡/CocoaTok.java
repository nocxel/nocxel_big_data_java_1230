package 인터페이스코코아톡;
// 메신저 기능에 대한 클래스
public class CocoaTok {
    String to; // 상대방 이름
    String msg; // 전달할 메시지
    CocoaTok(String name) {
        to = name;
    }
    public void writeMsg(String msg) {
        this.msg = to + " : " + msg;
    }
    public void send(NetAdapter na) {
        na.send(msg);

    }
}
