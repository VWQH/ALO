package practice;

public class StringSubsequence {
    public static void main(String[] args) {

        String word = "abc";
        System.out.println(getSubsequence(word));

    }


    private static String getSubsequence(String word){
        if(word.isEmpty())
            return "";

        char first = word.charAt(0);
        String rest = getSubsequence(word.substring(1));

        String result = "";
        for (String subs : rest.split(" ", -1)) {

            result += " " + first + subs;
            result += " " + subs;
        }

        return result.substring(1);
    }
}
