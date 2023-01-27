package 암호체크;

import java.util.Scanner;

// 암호체크
// 암호의 길이는 10 ~ 30자 사이
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중에 하나
// 입력받은 패스워드가 조건을 만족하면 "Good password", 만족하지않으면 "Bad password"출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력함녀 프로그램 종료
public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd;

        while (true) {
            System.out.print("비밀번호를 입력해주십시오");
            pwd = sc.nextLine();
            if (pwd.equals("exit") || pwd.equals("종료")) {
                System.out.println("종료합니다");
                break;
            }
            if (isContainExMark(pwd) && isContainLower(pwd) && isContainUpper(pwd) && isContainNum(pwd) && validLength(pwd)) {
                System.out.println("Good password");
            } else {
                System.out.println("Bad password");
            }

        }
    }
    // 특수문자 포함 여부
    public static boolean isContainExMark(String pwd) {
        String[] exMarks = {"!", "%", "_", "#", "&", "+", "-", "*", "/"};
        for (int i = 0; i < exMarks.length; i++) {
            if (pwd.contains(exMarks[i])) {
                return true;
            }
        }
        return false;
    }
    // 길이 조건 만족
    public static boolean validLength (String pwd) {
        if (pwd.length()<31 && pwd.length()>9) return true;
        else return false;
    }
    // 소문자 포함 여부
    public static boolean isContainLower (String pwd) {
        //ASC비교로찾자
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
        }
        return false;
    }
    // 대문자 포함 여부
    public static boolean isContainUpper (String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <='Z') return true;
        }
        return false;
    }
    // 숫자 포함 여부
    // int => String => 10개 비교가 빠를까  String.contains가 효율적인가
    // String 길이만큼 돌려서 비교가 빠를까 30자   그냥 char형비교가 효율적인가
    // for문 10~30번 돌고 char로 가져와서 비교연산 vs 딱 10번만 돌지만 Int to Stirng 형변환 contain연산

    public static boolean isContainNum (String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if(pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
        }
    return false;
    }
    public static boolean isContainNum2 (String pwd) {
        for (int i = 0; i < 10; i++) {
            if (pwd.contains(Integer.toString(i))) return true;
        }
        return false;
    }


}
