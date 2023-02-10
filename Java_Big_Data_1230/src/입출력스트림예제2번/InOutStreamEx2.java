package 입출력스트림예제2번;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상 클래스 입니다.
public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while (true) {
//            int data = is.read(); // 1바이트 씩 읽기
//            if (data == -1) break;
//            System.out.print(data + " ");
            int readByteNum = is.read(buffer); // 매개 변수로 전달한 buffer에 값을 넣음
            // read()로 읽으면 비효율적?

            if(readByteNum == -1) break;

            for (int i = 0; i < readByteNum; i++) {
                System.out.print(buffer[i] + " ");
            }
        }
        is.close(); // 읽기 위해 열어 둔 스트림을 닫음 .. 반드시 닫아줘야함


    }
}
