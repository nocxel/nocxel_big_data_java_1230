package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("정경수", DevType.EMBEDDED, Carrer.SENIOR, Gender.MALE);
        developer.viewInfo();

    }
}
