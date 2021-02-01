package com.hqh.Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

    //
    // Hàm chuyển đổi một Danh sách thành Luồng
    private static  <T> void getStream(List<T> list){
        Stream<T> stream = list.stream();

        Iterator<T> it = stream.iterator(); // tạo bộ lặp

        while (it.hasNext())
            System.out.println(it.next() + " ");

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        getStream(list);
    }


}
