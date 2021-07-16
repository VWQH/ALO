package algorithms.Sort;

public class BubbleSort {

    static void bubbleSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if(a[j] > a[j - 1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void countSwap(int a[]){
        int count = 0;
        boolean flag = false;
        while (!flag){
            flag = true;
            for (int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    flag = false;
                    count++;
                }
            }
        }

        System.out.println(String.format(
                "Array is sorted in %d swaps.%n" +
                        "First Element: %d%n" +
                        "Last Element: %d%n",
                count,
                a[0],
                a[a.length - 1]));
    }

    public static void main(String[] args) {
        int a[] = {4, 2, 3, 1};
        // bubbleSort(a);
        countSwap(a);
    }
}
