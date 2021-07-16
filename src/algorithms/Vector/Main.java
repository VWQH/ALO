package algorithms.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add("K");
        System.out.println(v);

        Vector<Integer> V2 = new Vector<Integer>();
        V2.add(1);
        V2.add(3);
        V2.add(5);
        V2.set(0, 20);
        V2.remove(2);
        System.out.println(V2);
    }
}
