import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveDuplicateOfSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        System.out.println(removeDuplicates(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        System.out.println("Input :: " + Arrays.toString(nums));
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[j-1]) {
                nums[i+1] = nums[j];
                i++;
            }
        }

        System.out.println("Output :: " +Arrays.toString(nums));

        return i+1;
    }
}