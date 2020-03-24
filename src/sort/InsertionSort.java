package sort;

public class InsertionSort {
    public static int[] sort (int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int curr = nums[i];
            for (int j=i-1; j>=0; j--) {
                if (nums[j] > curr) {
                    nums[j+1] = nums[j];
                    nums[j] = curr;
                } else {
                    break;
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
