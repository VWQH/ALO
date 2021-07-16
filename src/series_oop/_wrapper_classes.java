package series_oop;

public class _wrapper_classes {

    /*
    *       Primitive type                           Wrapper class
    *           boolean                                 Boolean
    *           byte               Boxing               Byte
    *           char             ---------->            Character
    *           float                                   Float
    *           int                                     Integer
    *           long                                    Long
    *           short            <----------            Short
    *           double             Unboxing             Double
    * */


    public static void main(String[] args) {

        // auto boxing

        // convert primitive data type to Wrapper  // 0
        int a = 20;
        // Integer obj = Integer.valueOf(a);
        Integer j = a;
        System.out.println(j);


        // unboxing

        // convert Wrapper to primitive date type  // null
        Integer b = Integer.valueOf(3);

        // Integer c = Integer.parseInt("4");
        // int i = b.intValue();
        int z = b;
        System.out.println(z);



    }

}
