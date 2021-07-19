package series_unica;

public class _1662_Check_If_Two_String_Arrays {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (String s: word1) {
            s1 += s;
        }

        for (String s: word2) {
            s2 += s;
        }

        return s1.equals(s2);
    }

    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s: word1) {
            sb1.append(s);
        }
        for (String s: word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"abc", "def"};
        String[] word2 = {"ab", "cde", "f"};
        // System.out.println(arrayStringsAreEqual(word1, word2));
        System.out.println(arrayStringsAreEqual1(word1, word2));
    }

}
