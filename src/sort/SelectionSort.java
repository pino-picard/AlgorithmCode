package sort;

public class SelectionSort {
    public static int[] sort (int[] nums) {
        for (int i=0; i< nums.length; i++) {
            int min=nums[i];
            int addr = i;
            for (int j=i; j< nums.length; j++) {
                if (nums[j]<min) {
                    min = nums[j];
                    addr = j;
                }
            }
            int tmp = nums[addr];
            nums[addr]=nums[i];
            nums[i] = tmp;
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
