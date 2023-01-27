package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // 인터페이스 내부의 변수는 public final static 이 자동으로 추가 됨
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 추상메소드가 됨 (abstract 자동 추가 됨)
    void airConOFF();
    void setAirConTemp(int tmp);
}
