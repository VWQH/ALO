package Algorithms.Search;

public class BinarySearch {

    static int search(int a[], int x){
        int left = 0, right = a.length-1, mid;
        while (left < right){
            mid = (left + right)/2;
            if(x == a[mid])
                return mid;
            if(x > a[mid])
                left = mid + 1;
            else right = mid;
        }
        return -1;
    }

    static int searchB(int a[], int l, int r, int x){
        if(l > r)
            return -1;
        int mid = (l + r)/2;
        if(x == a[mid])
            return mid;
        if(x > a[mid])
            return searchB(a, mid + 1, r, x);
        return searchB(a, l, mid, x);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int x = 2;
//        int result = search(a, x);
//        if(result == -1)
//            System.out.println("No");
//        else System.out.println(result);

        int result = searchB(a, 0, 7, x);
        if(result == -1)
            System.out.println("No");
        else System.out.println(result);
    }
}
