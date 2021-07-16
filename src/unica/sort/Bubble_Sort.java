package unica.sort;

import java.util.Arrays;

public class Bubble_Sort {

    /*
     *      + Chạy từ đầu đến cuối mảng
     *      + Nếu phần tử đứng trước mà lớn hơn phần tử đứng sau thì đổi chỗ
     *      + Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới và 'nổi bọt'
     * */

    public static void bubbleSort(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            /*
            * vì so a[j] vs a[j+1] sau khi sắp xếp thì phần tử cuối cùng sẽ nổi bọt nên n - i - 1
            * */
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]){
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printArray(i, a);
            if(isSorted == true){
                break;
            }
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
        // int[] a = {5, 3, 2, 7, 8, 1, 2};
        int[] b = {1, 2, 3, 6, 5};
        bubbleSort(b);
        // System.out.println(Arrays.toString(a));
    }

}
