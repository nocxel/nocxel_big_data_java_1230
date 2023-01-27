package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1 = new Member("1234567", "아멘", "wwwddd", 20, true);
        Member mem2 = mem1.getMember();

        mem2.age = 300;
        mem2.name = "Tiger";
        // 얕은 복사가 일어난다. 참조하는 주소를 복사했음. => 값을 바꾸면 주소가 같아서
        // mem2만 바꾸고 싶은데  => 클론을 쓰면된다

        System.out.println("name : " + mem1.name);
        System.out.println("age : " + mem1.age);
        System.out.println("name : " + mem2.name);
        System.out.println("age : " + mem2.age);



    }
}
