package lamda;

public class LamdaE {

    @FunctionalInterface
    interface sumTwo{
        int add(int a, int b);
    }

    public static void main(String[] args) {
        sumTwo s1 = (int a, int b) -> (a + b);
        System.out.println(s1.add(2, 4));

        //
        sumTwo s2 = (a, b) -> a + b;
        System.out.println(s2.add(5, 6));


        //
        sumTwo s3 = (a, b) -> {
            return (a + b);
        };
        System.out.println(s3.add(6, 7));


        //
        sumTwo s4 = (a, b) -> {
            int sum = a + b;
            return sum;
        };
        System.out.println(s4.add(1,3));

    }
}
