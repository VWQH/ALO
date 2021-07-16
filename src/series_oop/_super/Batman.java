package series_oop._super;

public class Batman extends Person{
    String power;

    public Batman(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.power;
    }
}
