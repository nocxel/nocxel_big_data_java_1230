package HashSet기본;

import java.util.HashSet;
import java.util.*;
// HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
// 중복 여부 확인은 hashCode()의 리턴값을 이용 합니다. (경우에 따라 오버라이딩 합니다.)
// equals도 중복 여부 확인을 합니다.

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1001, "유나"));
        set.add(new Member(1001, "정유나")); // hashCode값과 equals가 1001로 같아 set의 중복 여부에 걸려 무시됩니다.
        set.add(new Member(1003, "안유진"));
        Member mem4 = new Member(1004, "카리나");
        set.add(mem4);
        set.add(new Member(1003, "카즈하"));

        for(Member e : set) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("================");
        }

    }

}
class Member {
    int id;
    String name;

    @Override       // 해시코드를 id로 넘깁니다. id가 같으면 hashCode값이 같아집니다.
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {     // equals 를 오버라이딩해서 id가 같다면 equals가 true를 반환합니다.
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if(this.id == member.id) return true;
            else return false;
        }
        return false;
    }


    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }

}