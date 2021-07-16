package unica.recursion;

public class exp1 {

    public static void printElement(int a[], int i){
        if(i < 0 || i >= a.length)
            return;
        System.out.println(a[i]);
        printElement(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        printElement(a, 0);
    }
}
