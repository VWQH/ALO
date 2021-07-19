package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaT {

    public static class Product{
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Q", 200f));
        list.add(new Product(2, "W", 150f));

        Stream<Product> st = list.stream().filter(p -> p.price > 100);
        st.forEach(p -> System.out.println(p.name));
    }
}
