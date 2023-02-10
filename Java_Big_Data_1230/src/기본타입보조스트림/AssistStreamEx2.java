package 기본타입보조스트림;

import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("기본타입보조스트림.bin");
        DataOutputStream dos = new DataOutputStream(fos);   // 프로그램에서 사용할 수 있는 기본 타입을 지원하는 보조 스트림
        dos.writeUTF("남해이");    // 문자열 메소드
        dos.writeDouble(99.8);     // 실수형 메소드
        dos.writeInt(10);          // 정수형 메소드

        dos.writeUTF("남행선");
        dos.writeDouble(65.6);
        dos.writeInt(2);

        dos.writeUTF("채치수");
        dos.writeDouble(88.5);
        dos.writeInt(3);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("기본타입보조스트림.bin");
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < 3; i++) {
            String name = dis.readUTF(); // 문자열 읽기
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " : " + score + " : " + order);
        }

        dis.close();

    }
}
