package 제네릭응용;

//public class GenericPrinter<T> {   // generic으로 어떤 객체든지 T에 들어갈 수 있었음
public class GenericPrinter<T extends Material> {
    private T material;

    public void setMaterial (T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
