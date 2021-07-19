package com_hqh.java8;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestB {
    static class SV{
        //public int ID_SV;
        private int ID_SV;
    }

    public static void main(String[] args) {
        try {
            SV sv = new SV();
            Class obj = sv.getClass();
            /*Field idSV = obj.getField("ID_SV");
            idSV.set(sv, 21);
            int id = (int) idSV.get(sv);
            System.out.println(id);*/
            Field idSV = obj.getDeclaredField("ID_SV");
            idSV.setAccessible(true);
            idSV.set(sv, 22);
            System.out.println(idSV.get(sv));
            int tc = idSV.getModifiers();
            System.out.println(Modifier.toString(tc));
        }catch (Exception e){
            e.printStackTrace();
        }

        /*
        *   getName() -> trả về tên của phương thức
        *   getModifiers() -> trả về chỉ định quyền truy cập của các phương thức ở dạng số nguyên
        *   getReturnType() -> trả về kiểu dữ liệu trả về của phương thức
        *
        *   set() -> đặt giá trị của trường.
        *   get() -> trả về giá trị của trường.
        *
        * */

    }
}
