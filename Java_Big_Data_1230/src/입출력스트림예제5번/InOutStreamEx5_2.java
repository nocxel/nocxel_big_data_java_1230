package 입출력스트림예제5번;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InOutStreamEx5_2 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        String originalFileName = "Java_Big_Data_1230/src/입출력스트림예제5번/cat.jpg";
        String targetFileName = "D:/clone.jpg";

        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        int cnt = 0;
        byte[] buffer = new byte[100];
        while ((readByteNo = fis.read(buffer)) != -1) { // 파일인풋스트림 100바이트만큼 리드했는데 읽히면 진행
            fos.write(buffer, 0, readByteNo);
            cnt++;
        }
        System.out.println("버퍼 읽기 횟수 : " + cnt);

    }
}
