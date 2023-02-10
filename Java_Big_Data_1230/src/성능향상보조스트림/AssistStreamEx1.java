package 성능향상보조스트림;

import java.io.*;

public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;     // 입력에 대한 보조 스트림
        BufferedOutputStream bos = null;    // 출력에 대한 보조 스트림

        int data = -1;  // 더 이상 읽을 데이터가 없음을 의미함
        long start = 0; // 경과 시간 계산을 위한 변수
        long end = 0;   // 경과 시간 계산을 위한 변수

        fis = new FileInputStream("Java_Big_Data_1230/src/성능향상보조스트림/cat.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("cloneCat.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();

        // fis 에서 bis로 이동 -> fos에 쓰기
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        bos.close();
        bis.close();
        fis.close();
        fos.close();
        System.out.println("버퍼을 사용한 경우에 대한 시간 : " + (end - start) + "ms");


        // 버퍼 사용하면 매우 빠른 전송 가능

    }
}
