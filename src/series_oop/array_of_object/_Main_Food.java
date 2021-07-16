package series_oop.array_of_object;

public class _Main_Food {
    public static void main(String[] args) {
        Food f = new Food("pizza");
        Food f1 = new Food("hamburger");
        Food f2 = new Food("ice cream");

        // Food[] result = { f, f1, f2 };

        Food[] result = new Food[3];
        result[0] = f;
        result[1] = f1;
        result[2] = f2;

        System.out.println(result[0].name);

    }
}
