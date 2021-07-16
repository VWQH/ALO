package unica.search;

public class _704_Binary_Search {

    // binary search.
    public static int search(int[] a, int find) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(find == a[mid])
                return mid;
            else if(find > a[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int search_recursion(int[] a, int find, int left, int right){
        if(left > right)
            return -1;
        int mid = (left + right) / 2;
        if(find == a[mid])
            return mid;
        if(find > a[mid])
            return search_recursion(a, find, mid + 1, right);
        return search_recursion(a, find, left, mid - 1);
    }

    public static int searchB(int[] a, int find){
        return search_recursion(a, find, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = { -1, 0, 3, 5, 9, 12 };
        int find = 0;
        // System.out.println(search(a, find));
        System.out.println(searchB(a, find));
    }

}
