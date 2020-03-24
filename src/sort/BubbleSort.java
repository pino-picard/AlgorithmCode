package sort;

public class BubbleSort {
    public static int[] sort (int[] nums) {
        for (int j=nums.length; j > 0; j--) {
            for (int i=0; i<j-1; i++) {
                if (nums[i] > nums[i+1]) {
                    int tmp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = tmp;
                }
            }
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
