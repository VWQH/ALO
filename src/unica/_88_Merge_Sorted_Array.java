package unica;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {

    /*
    public static   void merge(int[] a1, int m, int[] a2, int n) {
        for (int i: a2) {
            addElement(i, a1, m);
            m++;
        }
    }

    private static void addElement(int x, int[] a, int m) {
        boolean findI = false;
        for (int i = 0; i < m; i++) {
            if(a[i] > x){
                findI = true;
                for (int j = m-1; j >= i; j--) {
                    a[j+1] = a[j];
                }
                a[i] = x;
                break;
            }
        }
        if(findI == false){
            a[m] = x;
        }
    }
     */

    // 2 con trỏ
    public static void merge1(int[] n1, int m, int[] n2, int n) {
        int i, j, k;

        i = m - 1;
        j = n - 1;
        k = (m + n) - 1;

        while (k >= 0){
            if(j < 0){
                n1[k] = n1[i];
                i--;
            }else if(i < 0){
                n1[k] = n2[j];
                j--;
            }else if(n1[i] > n2[j]){
                n1[k] = n1[i];
                i--;
            }else{
                n1[k] = n2[j];
                j--;
            }
            k--;
        }

    }


    public static void main(String[] args) {
        int[] n1 = {2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {5, 7, 9};

        // merge(n1, 4, n2, 3);
        // System.out.println(Arrays.toString(n1));

        merge1(n1, 4, n2, 3);
        System.out.println(Arrays.toString(n1));
    }
}
