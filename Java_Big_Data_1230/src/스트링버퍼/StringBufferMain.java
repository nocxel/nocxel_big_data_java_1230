package 스트링버퍼;
// StringBuffer : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정됨, 동기화 지원(멀티쓰레드에서 안전)
// StringBuilder : 객체 생성 후 사용, 문자열 추가 시 기존의 문자열이 수정됨, 동기화 지원 안됨, 성능은 우수
// String : 객체 생성 필요 없음, 문자열 추가 시 계속 새로운 문자열이 만들어 짐, 문자열 추가가 길어지면 성능 저하
// append() : 문자열을 추가 할 때 사용
// insert() : 특정 위치에 문자열을 삽입
// substring() : 문자열을 구간을 정해 잘라냄

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("to java");
        sb.append(" ");
        sb.append("Python");
        System.out.println(sb);

        sb.insert(6,"everyone");
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

//        String st = "hello";
//        st += " ";
//        st += "to java";
//        st += " ";
//        st += "Python";
//        // 문자열이 너무 많이 만들어짐


    }
}
