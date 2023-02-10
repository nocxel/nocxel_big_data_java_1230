package 입출력스트림연습문제;

public class Score implements Comparable<Score> {
    private String name;
    private int korean;
    private int english;
    private int math;

    public Score() {
    }

    public Score(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
    int getTotal() {
        return korean + english + math;
    }

    @Override
    public int compareTo(Score o) {

        if (this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        return o.getTotal() - this.getTotal();
    }

    // 1. 이름과 3개의 성적을 객체 단위로 관리하기 위해 클래스 생성하고 정렬을 위해 Comparable을 상속받거나 Comparator이용
    // 2. 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름 순으로) 에 대한 정렬 조건 구현

}

