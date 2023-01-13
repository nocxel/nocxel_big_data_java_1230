package 상속실습예제;

public class Person {
    int age;
    int sleep;

    public void setAge(int n) {
        this.age = n;
    }

    public int getAge() {
        return age;
    }

    public void setSleep(int n) {
        this.sleep = n;
    }

    public int getSleep() {
        return sleep;
    }
}

class Worker extends Person {
    int work;

    void setWork(int n) {
        this.work = n;
    }

    int getWork() {
        return work;
    }

    void infoPerson() {
        System.out.println("나이 : " + getAge());
        System.out.println("잠 : " + getSleep());
        System.out.println("일 : " + getWork());
    }
}

class Student extends Person {
    String study;
    Student(int n) {
        switch (n) {
            case 1:
                this.study = "열심히";
                break;
            case 2:
                this.study = "적당히";
                break;
            case 0:
                this.study = "놀면서";
                break;
            default:
        }
    }

    void setStudy(int n) {
        switch (n) {
            case 1:
                this.study = "열심히";
                break;
            case 2:
                this.study = "적당히";
                break;
            case 0:
                this.study = "놀면서";
                break;
            default:
        }
    }

    String getStudy() {
        return study;
    }
    void infoPerson() {
        System.out.println("나이 : " + getAge());
        System.out.println("잠 : " + getSleep());
        System.out.println("공부 : " + getStudy());
    }
}