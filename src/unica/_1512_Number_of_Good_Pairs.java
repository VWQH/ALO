package unica;

public class _1512_Number_of_Good_Pairs {

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]){
                    System.out.println("(" + i + "," + j + ")");
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //  int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums = {1, 1, 1, 1};
        System.out.println("Count " + numIdenticalPairs(nums));
    }
}
