package 피타고라스정리;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanThm {
    public static void main(String[] args) {
        // 삼각형의 세 변 : 중복허용 => 정렬도 필요 => Array
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        while(true) {
            for (int i = 0; i < 3; i++) {
                nums[i] = sc.nextInt();
            }
            if (nums[0]+nums[1]+nums[2] == 0) {
                break;
            }
            Arrays.sort(nums);


            // Math.pow()로하면 double 나오는데 손실없이 할 수 있나?
            if (Math.pow(nums[0],2) + Math.pow(nums[1],2) == Math.pow(nums[2],2)) {
                System.out.println("right");
            } else System.out.println("wrong");


        }

    }
}
