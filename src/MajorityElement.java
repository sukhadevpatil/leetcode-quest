import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2));
    }

    public static int majorityElement(int[] nums) {
        int returnVal = 0;
        int arraySize = nums.length / 2;

        for (int j = 0; j < nums.length; j++) {
            int counter = 0;
            for (int k = 1; k < nums.length; k++) {
                if (j != k && nums[j] == nums[k]) {
                    counter++;
                }
            }

            if (counter >= arraySize) {
                return  nums[j];
            }
        }

        return returnVal;
    }
}