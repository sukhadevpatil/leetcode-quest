import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7};
        int rotationCounter = 3;
        rotate(input1, rotationCounter);


        int[] input2 = {-1, -100, 3, 99};
        rotationCounter = 2;
        rotate(input2, rotationCounter);
    }

    public static void rotate(int[] nums, int k) {

        System.out.println("Input :: " + Arrays.toString(nums));
        int arrLength = nums.length;
        int[] tempArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            tempArr[(i + k) % arrLength] = nums[i];
        }

        for (int i = 0; i < tempArr.length; i++) {
            nums[i] = tempArr[i];
        }


        //Removes the whole rotations & handles only the remainders to rotate
        /*int finalRotation = k % nums.length;
        System.out.println(finalRotation);

        for(int i = 1; i <= finalRotation; i++) {
            for(int j = nums.length-1; j >= 1 ; j--) {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }*/

        System.out.println("Output :: " + Arrays.toString(nums));
    }
}
