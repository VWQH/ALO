package series_unica;

public class _27_Remove_Element {

    public static int removeElement(int[] a, int x) {

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != x){
                a[k] = a[i];
                k++;
            }
            // else do not.
        }
        return k;
    }



    public static void main(String[] args) {
        int a[] = {2, 3, 2, 4};
         System.out.println(removeElement(a, 2));
    }
}
