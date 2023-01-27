package 열거타입예제;

public class Developer {
    private String name;
    private DevType type;
    private Carrer career;
    private Gender gender; // DB관리에 용이하겠구나

    public Developer(String name, DevType type,  Carrer career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    public void viewInfo() {
        System.out.println(name + type + career + gender);
    }
}
