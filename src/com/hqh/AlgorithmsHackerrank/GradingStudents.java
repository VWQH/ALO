package com.hqh.AlgorithmsHackerrank;

public class GradingStudents {

    static void isSue(int a[], int n){
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++){
                if(a[i] == a[j] && i != j)
                    count++;
            }
            if(count == 0)
                System.out.print(a[i] + " ");
        }

    }

//    static int isSue2(int a[], int n){
//        for (int i = 0; i < n; i++) {
//            int j;
//            for (j = 0; j < n; j++) {
//                if(a[i] == a[j] && i != j)
//                    break;
//            }
//            if (j == n)
//                return a[i];
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 1}, n = a.length;
         isSue(a, n);
        //System.out.println(isSue2(a, n));
    }
}
