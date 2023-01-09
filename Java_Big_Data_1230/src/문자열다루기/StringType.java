package 문자열다루기;
// equls 메소드 : 두 개의 문자열이 동일한지 비교하여 결과값을 리턴

public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분없이 비교

        String d = "Hello.Jav.Java";
        // indexOf : 문자열에 특정 문자 혹은 문자열이 시작되는 인덱스를 리턴
        System.out.println(d.indexOf("Jav")); // 6
        // contains : 문자열에서 특정 문자열의 포함 여부를 리턴
        System.out.println(d.contains("Hello")); // true
        // charAt : 문자열에서 특정 위치의 문자를 리턴 함
        System.out.println(d.charAt(0)); // H
        // replaceAll("format형식",바꿀것") : 문자열 중 특정 문자열을 다른 문자열로 대체
        System.out.println(d.replaceAll("."," ")); // "."을 바꾸기 위해서는 "\\."이나 "[.]" 이렇게 해야함 정규식때문에
        System.out.println(d.replaceAll("\\."," "));
        System.out.println(d.replaceAll("[.]"," "));
        System.out.println();
        // substring : 문자열에서 특정 문자열을 뽑아 낼 때 사용
        String e = "Hello Java";
        System.out.println(e.substring(1));  // 인덱스 1부터 끝까지 출력
        System.out.println(e.substring(1,5)); // 인덱스 1부터 5미만까지

        System.out.println("=====to Upper, LowerCase()=====");
        // toUpperCase / toLowerCase : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());

        System.out.println("===== trim =====");
        // trim 문자열 앞 뒤에 있는 공백 제거
        String str = "   자바 프로그램   !!!!! ";
        System.out.println(str.trim());
        // 문자열 포매팅이란? 문자열에 특정 문자를 삽입하는 방법 (삽입을 위해서는 서식이 필요)
        System.out.printf("자바 프로그램을 %s합시다.\n", "열심히");
        String newStr = "";
        newStr = String.format("자바 프로그램을 %s 합시다\n", "열심히"); // 새로운 변수에 대입할때는 이렇게

        // toCharArray() : 문자열을 문자 배열로 반환



    }
}
