package 제네릭응용;

public class GenericTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder()); // T material 에 powder객체
//        GenericPrinter<String> powederPrinter = new GenericPrinter<>(); // genericPrinter가 Material 을 상속받은 객체만 취급함
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);


    }
}
