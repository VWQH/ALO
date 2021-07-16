package series_oop.overloaded_constructors;

public class Pizza {

    // default is public
    public String bread;
    public String sauce;
    public String cheese;
    public String topping;

    public Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    public Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

}
