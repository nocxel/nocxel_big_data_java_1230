package 배열로로또번호생성;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//리스트 타입 => HashSet이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int tmp;
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            set.add(tmp);
            if (set.size() == 6) break;
        }
        for (Integer e : set) System.out.print(e + " ");

    }
}

