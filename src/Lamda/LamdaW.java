package Lamda;

public class LamdaW {

    @FunctionalInterface
    interface qwer{
        public String say(String name);
    }

    public static void main(String[] args) {

        qwer s1 = (name) -> {
            return name;
        };
        System.out.println(s1.say("Q"));

        //
        qwer s2 = name -> {
            return name;
        };
        System.out.println(s2.say("W"));

        //
        qwer s3 = name -> name;
        System.out.println(s3.say("E"));

    }
}
