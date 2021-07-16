package series_oop;

import java.util.ArrayList;

public class _2D_ArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(2);
        a2.add(4);
        a2.add(5);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(5);
        a3.add(5);
        a3.add(6);

        list.add(a1);
        list.add(a2);
        list.add(a3);

        System.out.println(list.get(0).get(1));
    }
}
