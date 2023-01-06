package 배열로로또번호생성;

import java.util.ArrayList;
import java.util.List;

public class LottoArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int tmp;
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            if (!list.contains(tmp)) list.add(tmp);
            if (list.size() == 6) break;
        }
        for (Integer e : list) System.out.print(e + " ");

    }
}

