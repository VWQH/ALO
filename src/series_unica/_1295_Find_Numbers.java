package series_unica;

public class _1295_Find_Numbers {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a: nums) {
            if(checkNum(a) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int checkNum(int a){
        int count = 0;
        int result = a;
        while (result != 0){
            result = a / 10;
            a = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
