package unica.sort;

public class Insertion_Sort {

    /*
     *      + Chạy từ đầu đến cuối mảng
     *      + Tại vòng lặp thứ i, coi như dãy từ [0, i-1] đã được sắp xếp, chèn phần tử a[i] vào vị trí thích hợp.
     *      + Sau vòng lặp thứ i thì dãy [0, i] đã được sắp xếp.
     * */

    public static void insertionSort(int a[]){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;

            while (j >=0 && a[j] > ai){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
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
        insertionSort(a);
    }
}
