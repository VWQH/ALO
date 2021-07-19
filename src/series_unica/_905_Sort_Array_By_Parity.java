package series_unica;


import java.util.Arrays;

public class _905_Sort_Array_By_Parity {

    public static int[] sort_Array(int[] a){
        int n = a.length;
        int i = 0;
        int j = n -1;

        while (i < j){
            if(a[i]%2 != 0){
                if(a[j]%2==0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = { 3, 1, 2, 4 };
        // int[] b = { 1, 2, 1, 2, 1, 1 };
        sort_Array(a);
        System.out.println(Arrays.toString(a));
    }
}
