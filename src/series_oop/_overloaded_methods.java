package series_oop;

public class _overloaded_methods {

    public static void main(String[] args) {
        int x = add(1, 2);
        System.out.println(x);
    }

    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a + b;
    }

}
