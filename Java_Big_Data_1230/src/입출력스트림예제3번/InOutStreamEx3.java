package 입출력스트림예제3번;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 바이트 출력 스트림의 최상위 추상 클래스는 OutputStream
// 문자 출력 스트림의 최상위 추상 클래스는 Write 입니다.
public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt");
//        char[] data = "일타스캔들 재밌음".toCharArray();
        String data = "재벌집 막내아들 끝은 별로다.";

        writer.write(data);
        writer.flush(); // 버퍼 비우는 용도
        writer.close();

    }
}
