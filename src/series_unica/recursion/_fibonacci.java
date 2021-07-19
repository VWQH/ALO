package series_unica.recursion;

public class _fibonacci {

    public static int fibonacci(int n){
        System.out.println("F[" + n + "]");
        if(n <= 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // + Tối ưu đệ quy
    // đệ quy có nhớ.
    static int[] F = new int[50];
    public static int fibonacci1(int n){
        if(F[n] != 0)
            return F[n];
        System.out.println("F[" + n + "]");
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = fibonacci1(n-1) + fibonacci1(n-2);
        return F[n];
    }


    // Khử đệ quy
    public static void fibonacci2(int n){
        int[] Fibonacci = new int[11];
        Fibonacci[1] = 1;
        Fibonacci[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        }
        System.out.println(Fibonacci[10]);
    }


    public static void main(String[] args) {
        // System.out.println(fibonacci1(5));
        // System.out.println(fibonacci(9));
        fibonacci2(10);
    }
}
