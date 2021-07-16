package series_oop._polymorphism.exp1;

public class _Main_p {
    public static void main(String[] args) {
        Vehicle v;
        v = new Bike();
        v.run();
        v = new Car();
        v.run();

    }
}
