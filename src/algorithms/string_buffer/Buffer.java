package algorithms.string_buffer;

public class Buffer {


    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ABC");
        // System.out.println(s.length() + " " + s.capacity());

        // s.append("D");
        // s.append(0);
        System.out.println(s.replace(0, 2, "K"));

        s.insert(1, "for");

        System.out.println(s);
        System.out.println(s.reverse());
        System.out.println("Delete " + s.delete(0, 2));
        System.out.println(s.deleteCharAt(1));

        // Append ', '(44) to the String
        s.appendCodePoint(44);
        System.out.println(s);
    }
}
