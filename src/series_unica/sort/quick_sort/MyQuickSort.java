package series_unica.sort.quick_sort;

import java.util.Arrays;

public class MyQuickSort {

    public static void quickSort(int[] a, int L, int R){

        // điều kiện dừng.
        if(L >= R)
            return;
        // chọn khóa.
        int key = a[(L + R) / 2];
        // phân bố lại mảng theo khóa.
        int k = partition(a, L, R, key);
        System.out.println("L=" + L + " R=" + R + "  key=" + key + "  k=" + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        System.out.println(" ======== ");
        // chia đôi mảng => lặp lại.
        quickSort(a, L, k - 1);
        quickSort(a, k , R);

    }
    
    // phân bố mảng.
        // return pilot value(chốt).
    static int partition(int[] a, int L, int R, int key){
        int iL = L;
        int iR = R;
        while (iL <= iR){
            while(a[iL] < key) iL++;
            while(a[iR] > key) iR--;
            // swap
            if(iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = { 6, 7, 8, 5, 4, 1, 2, 3 };
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
