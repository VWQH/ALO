package algorithms.jagged_array;

public class Main {
    public static void main(String[] args) {
        int r = 3;
        int a[][] = new int[r][];

        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i + 1];
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
