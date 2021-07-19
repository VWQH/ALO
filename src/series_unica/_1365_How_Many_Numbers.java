package series_unica;

import java.util.Arrays;

public class _1365_How_Many_Numbers {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] countSmaller = new int[n];

        for (int i = 0; i < n; i++) {
            int k = nums[i];
            for (int j = 0; j < n; j++) {
                if(nums[j] < k ){
                    countSmaller[i]++;
                }
            }
        }
        return countSmaller;
    }

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
