package contest;

import java.util.Arrays;

public class FinalArrayStateKMultiplications {

    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;

        int[] result = getFinalState(nums, k, multiplier);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int j = k; j > 0; j--) {
            int minValIndex = 0;
            int minVal = nums[0];
            for(int i = 1; i < nums.length; i++) {
                if (nums[i] < minVal) {
                    minVal = nums[i];
                    minValIndex = i;
                }
            }

            System.out.println(Arrays.toString(nums));

            nums[minValIndex] = nums[minValIndex] * multiplier;
        }

        return nums;
    }
}
