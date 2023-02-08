package 스트림예제3번;

import java.util.Arrays;
import java.util.stream.Stream;

// 배열로 부터 스트림 만들기
public class StreamEx3 {
    public static void main(String[] args) {
        String[] arr = {"남해이", "최치열", "남행성", "우영우", "고유림", "나희도"};
        Stream<String> stream1 = Arrays.stream(arr);    // 배열로 스트림만듬
        stream1.forEach(e -> System.out.print(e + " "));

    }
}
