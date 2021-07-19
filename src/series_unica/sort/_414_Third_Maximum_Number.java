package series_unica.sort;

public class _414_Third_Maximum_Number {

    public static void printArray(long[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void insert(long[] maxArr, int val){
        int i = 0;
        while (i < maxArr.length){
            if(val == maxArr[i]){
                return;
            }else if(val > maxArr[i]){
                break;
            }else {
                i++;
            }
        }
        if(i < maxArr.length){
            for (int j = maxArr.length-2; j >= i; j--) {
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = val;
            // printArray(maxArr);
        }
    }

    public static int thirdMax(int[] a) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        int n = a.length;
        for (int i = 0; i < n; i++) {
            insert(maxArr, a[i]);
        }
        if(maxArr[2] == Long.MIN_VALUE)
            return (int)maxArr[0];
        return (int)maxArr[2];
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 3, 1};
        // int[] a = {1, 2};
        System.out.println(thirdMax(a));
    }
}
