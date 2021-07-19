package com_hqh.java8;

public class Test8 {

    static class SV{

    }
    static class SVY extends SV{
        public void printF(){
            System.out.println("OK");
        }
    }
    public static void main(String[] args) {
        SVY svy = new SVY();
        Class obj = svy.getClass();
        String name_Class = obj.getName();
        System.out.println(" " + name_Class);
        Class name_Class_C = obj.getSuperclass();
        System.out.println(" " + name_Class_C);

        /*
        *  Method ->  cung cấp thông tin về các phương thức trong một lớp.
        *  Field -> cung cấp thông tin về các trường trong một lớp.
        *  Constructor -> cung cấp thông tin về các phương thức khởi tạo trong một lớp.
        * */
    }
}
