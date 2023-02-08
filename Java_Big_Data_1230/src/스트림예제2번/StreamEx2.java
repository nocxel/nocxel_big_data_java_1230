package 스트림예제2번;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("남해인", 89));
        list.add(new Student("최지일", 99));
        list.add(new Student("남행인", 69));

        list.parallelStream().forEach(s -> {      // 병렬처리
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });

        double avg = list.stream().mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("평균 점수 : " + avg);


    }
}
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
