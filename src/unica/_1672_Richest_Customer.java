package unica;

public class _1672_Richest_Customer {

    public static int maximumWealth(int[][] a) {
        int cus = a.length; // 3
        int bank = a[0].length; // 2
        int[] sumMax = new int [cus];
        for (int i = 0; i < cus; i++) {
            int sum = 0;
            for (int j = 0; j < bank; j++) {
                sum += a[i][j];
            }
            sumMax[i] = sum;
        }
        int max = 0;
        for (int i = 0; i < cus; i++) {
            // System.out.println("Cus " + i + " sum " + sumMax[i]);
            if(sumMax[i] > max){
                max = sumMax[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

//        int[][] a = {
//                {1, 2, 3},
//                {3, 2, 1}
//        };

        int[][] a = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println(maximumWealth(a));
    }

}
