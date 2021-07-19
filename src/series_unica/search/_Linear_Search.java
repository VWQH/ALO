package series_unica.search;

public class _Linear_Search {

    public static int search(int a[], int find){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i] == find)
                return i;
        }
        return -1;
    }

    // recursion
    public static int searchB(int a[], int find, int L, int R){
        if(R < L)
            return -1;
        if(a[L] == find)
            return L;
        if(a[R] == find)
            return R;
        return searchB(a, find, L+1, R-1);
    }

    public static void main(String[] args) {
        int[] a = { -1, 0, 3, 5, 9, 12 };
        int find = 9;
        // System.out.println(search(a, find));
        System.out.println(searchB(a, find, 0, a.length - 1));
    }
}
