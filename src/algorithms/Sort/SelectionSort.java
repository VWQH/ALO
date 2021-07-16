package algorithms.Sort;

public class SelectionSort {

    static void selectionSort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            int ele_min = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[min])
                    min = j;
            }
            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        printArray(a);
    }

    static void printArray(int a[])
    {
        for (int i=0; i< a.length; ++i)
            System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = { 8,11,5,1};
        selectionSort(a);
    }
}
