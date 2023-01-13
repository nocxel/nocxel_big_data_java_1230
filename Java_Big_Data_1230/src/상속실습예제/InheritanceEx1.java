package 상속실습예제;
// 인간이라는 클래스 생성
// - age (정수 값, 게터, 세터) sleep (정수 값, 게터, 세터)
// 인간을 상속받아 직장인 생성 worker
// work특성 (정수, 게터, 세터)
// 인간을 상속받아 학생을 생성 student
// study 공부하는 특성 (1로 입력받으면 "열심히", 2를 입력받으면 "적당히", 3을 입력받으면 "놀면서")

public class InheritanceEx1 {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student(2);
        student.setAge(27);
        student.setSleep(8);
        student.setStudy(0);
        student.infoPerson();

        Worker worker = new Worker();
        worker.setWork(8);
        worker.setSleep(8);
        worker.setAge(40);
        worker.infoPerson();

    }
}
