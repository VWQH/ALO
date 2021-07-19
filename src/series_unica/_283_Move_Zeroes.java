package series_unica;

import java.util.Arrays;

public class _283_Move_Zeroes {

    public static void moveZeroes(int[] a) {
        int n = a.length;
        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] != 0){
                a[currentIndex] = a[i];
                currentIndex++;
            }
        }
        for (; currentIndex < n; currentIndex++) {
            a[currentIndex] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
