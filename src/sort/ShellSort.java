package sort;

public class ShellSort {
    public static int[] sort (int[] nums) {
        for (int gap = nums.length/2; gap > 0; gap = gap/2) {
            for (int i=gap; i<nums.length; i++) {
                int curr = nums[i];
                for (int j=i; j-gap>=0; j-=gap) {
                    if (nums[j-gap] > curr) {
                        nums[j] = nums[j-gap];
                        nums[j-gap] = curr;
                    } else {
                        break;
                    }
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
