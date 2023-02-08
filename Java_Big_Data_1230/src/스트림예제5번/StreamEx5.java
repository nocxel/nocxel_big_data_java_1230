package 스트림예제5번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환, 중개 연산은 연속으로 연결해서 사용 가능
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 변환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
public class StreamEx5 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream stream3 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        // 스트림에서 중복 요소를 제거함
        stream1.distinct().forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 스트림에서 홀수만 골라냄+
        stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 짝수
        stream3.filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));


        // 스트림 변환 : 해당 스트림의 요소들에 주어진 함수로 전달하여, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream<String> stream = Stream.of("HTML","CSS","JAVASCRIPT","JAVA");
        stream.map(s-> s.length()).forEach(System.out::println);

//        Stream<String> stream4 = {"I study hard","You study Java","I am hungry"}; 안되누...
        String[] arr = {"I study hard","You study Java","I am hungry"};
        Stream<String> stream4 = Arrays.stream(arr);
        stream4.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);

        // 스트림 제한
        // limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소로만 이루어진 스트림
        // skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수 만큼의 요소를 제외하고 출력
        IntStream stream5 = IntStream.range(0,10);
        IntStream stream6 = IntStream.range(0,10);
        IntStream stream7 = IntStream.range(0,10);
        stream5.limit(5).forEach(s -> System.out.print(s + " "));
        stream6.skip(5).forEach(n -> System.out.print(n + " "));
        stream7.skip(3).limit(5).forEach(n -> System.out.print(n + " "));

        // 스트림 정렬 : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        Stream<String> stream9 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream8.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));


    }

}
