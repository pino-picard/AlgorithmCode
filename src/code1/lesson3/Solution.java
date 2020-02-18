package code1.lesson3;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        // 建立一个长为 n的数组，初始化值为-1
        int[] temp = new int[nums.length];
        for (int m = 0; m < nums.length; m++) {
            temp[m] = -1;
        }

        // 获取temp中位置为nums[i]处的值，如果为-1则表明初次出现，将nums[i]赋值到temp对应位置
        // 如果不为-1则表明已经出现过，返回此时的nums[i]
        for (int i = 0; i < nums.length; i++) {
            if (temp[nums[i]] == -1) {
                temp[nums[i]] = nums[i];
            } else {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        Solution s = new Solution();
        System.out.println(s.findRepeatNumber(nums));
    }

}
