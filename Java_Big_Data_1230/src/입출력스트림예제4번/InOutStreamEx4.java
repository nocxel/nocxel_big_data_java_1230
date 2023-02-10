package 입출력스트림예제4번;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader는 문자 스트림의 최상위 추상 클래스 입니다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readData;
        char[] cbuf = new char[10];
        String data = "";
        while (true) {
            readData = reader.read(cbuf); // 한 개의 문자(2바이트)를 읽어 4바이트 int 타입으로 반환
            if (readData == -1) break;
            data += new String(cbuf,0,readData); // int형 다시 char로 변환해서 찍기
        }
        System.out.println(data);
        reader.close();

    }
}
