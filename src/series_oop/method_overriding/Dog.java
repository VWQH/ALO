package series_oop.method_overriding;

public class Dog extends Animal{
    @Override
    void speak() {
        super.speak();
        System.out.println("Dog");
    }
}
