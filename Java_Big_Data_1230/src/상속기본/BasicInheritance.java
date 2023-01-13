package 상속기본;

public class BasicInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("포메");
        HouseDog housedog = new HouseDog();
        housedog.setName("진돗개");
        housedog.sleep();
        housedog.sleep(4);
    }
}
