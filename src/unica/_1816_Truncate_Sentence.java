package unica;

public class _1816_Truncate_Sentence {

    // C1  // 14 ms
    public static String f1(String s, int k){
        String[] arr = s.split(" ");
        String result = "";
        for (int i = 0; i < k; i++) {
            if(i == 0){
                result += arr[i];
            }else{
                result += (" " + arr[i]);
            }
        }
        return result;
    }

    // C2
    public static String f2(String s, int k){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if(i == 0){
                sb.append(arr[i]);
            }else{
                sb.append(" " + arr[i]);
            }
        }
        return sb.toString();
    }

    // C3
    public static String f3(String s, int k){
        int countSpace = 0;
        s = s + " ";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                countSpace++;
            }
            if(countSpace == k){
                return s.substring(0, i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(f3(s, k));
    }

}
