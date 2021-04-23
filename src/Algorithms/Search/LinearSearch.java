package Algorithms.Search;

public class LinearSearch {

    static int search(int a[], int x){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x)
                return i;
        }
        return -1;
    }

    static void searchB(int a[], int x){
        int i = 0;
        int n = a.length;
        while ((i < n) && (a[i] != x))
            i++;
        if(i == n)
            System.out.println("No");
        else
            System.out.println(x + " at " + i);
    }

    static int searchC(int a[], int l, int r, int x){
        if(r < l)
            return -1;
        if(a[l] == x)
            return l;
        if(a[r] == x)
            return r;
        return searchC(a, l+1, r-1, x);
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 80, 30, 60, 50, 110};
        int x = 30;


//        int result = search(a, ele);
//        if(result == -1)
//            System.out.println("No");
//        else
//            System.out.println(result);


//        searchB(a, ele);

        int result = searchC(a, 0, a.length-1, x);
        if(result != -1)
            System.out.println(result);
        else
            System.out.println("No");
    }
}
