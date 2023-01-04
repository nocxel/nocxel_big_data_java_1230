package 윤년구하기;

public class LeapYear {
    public static void main(String[] args) {
        // 윤년은 4년 마다 한번있음. 100으로 나누어 지면 윤년 X, 400으로 나눠지면 윤년임!!

        int year = 1900;
        // 4로 나눠지는가 yes => 100으로 나눠지는가 yes => 400으로 나눠지는가 yes => true
        // 4로 나눠지는가 yes => 100으로 나눠지는가 yes => 400으로 나눠지는가 no => false
        // 4로 나눠지는가 yes => 100으로 나눠지는가 no => true
        // 4로 나눠지는가 no => false
        boolean isLeap = year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? true: false) : true ): false;

        System.out.println(isLeap);
    }
}
