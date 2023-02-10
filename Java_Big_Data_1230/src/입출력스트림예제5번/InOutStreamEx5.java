package 입출력스트림예제5번;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InOutStreamEx5 {
    public static void main(String[] args) throws URISyntaxException, IOException {
        File temp = new File("Java_Big_Data_1230/src");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
        File[] contents = temp.listFiles();
        System.out.println("날짜              시간         형태       크기    이름");
        System.out.println("-------------------------------------------------------------------");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified()))); // 파일의 최종 갱신 시간
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t\t\t" + file.getName()); // 파일 이름을 스트링으로 반환
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
