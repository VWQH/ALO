package series_unica.sort;

public class Selection_Sort {

    /*
    *      + Chạy từ đầu đến cuối mảng
    *      + Tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1, n-1], nếu nhỏ hơn a[i] thì đổi chỗ cho a[i]
    *      + Sau vòng lặp thứ im thì dãy [0, i] đã được xếp.
    * */

    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i, a);
        }
    }

    public static void printArray(int no, int[] a){
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        selectionSort(a);
    }
}
