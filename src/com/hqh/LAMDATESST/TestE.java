package com.hqh.LAMDATESST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestE {


    static class Product{
        int ID;
        String name;
        float price;

        public Product(int ID, String name, float price) {
            this.ID = ID;
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "UP", 25000f));
        list.add(new Product(2, "CEO", 350f));
        list.add(new Product(3, "SEO", 9500f));
        list.add(new Product(4, "FO", 9500f));

        Collections.sort(list, ((o1, o2) -> {
            return o1.name.compareTo(o2.name);
        }));
        for (Product p: list) {
            System.out.println(p.ID + " " + p.name);
        }

        Stream<Product> stream = list.stream().filter(p -> p.price > 20000);
        stream.forEach(product -> System.out.println(product.ID));

    }
}
