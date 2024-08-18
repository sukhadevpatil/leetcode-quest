import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicateOfSortedArray2 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length < 3) return 0;
        int i = 2;
        System.out.println("Input :: " + Arrays.toString(nums));
        for(int j = 2; j < nums.length; j++) {
            if(nums[j] != nums[i-2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        System.out.println("Output :: " +Arrays.toString(nums));

        return i;
    }
}