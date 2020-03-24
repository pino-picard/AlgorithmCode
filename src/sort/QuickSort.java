package sort;

public class QuickSort {
    public static int[] sort (int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int i=0;
        int j= nums.length;
        int x = nums[0];
        while (i<j) {

        }

        return nums;
    }


    public static void main (String[] args) {
        int[] nums = {9,2,22,45,51,16,27,19,25,3,5,1,6,7};
        int[] target = sort(nums);
        for (int i=0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }
}
