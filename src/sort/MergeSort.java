package sort;

import java.util.Arrays;

public class MergeSort {
    // 递归实现
    public static int[] sort (int[] nums) {
        if (nums.length <= 1) {
            return nums;
        } else {
            int mid = nums.length / 2;
            int[] left = sort(Arrays.copyOfRange(nums,0,mid));
            int[] right = sort(Arrays.copyOfRange(nums,mid,nums.length));
            return merger(left,right);
        }
    }

    // 循环实现
//    public static int[] sort2 (int[] nums) {
//        for (int width=1; width <= nums.length; width*=2) {
//            for (int i=0; i < nums.length; i=i + 2*width) {
//                int[] left = Arrays.copyOfRange(nums,i, i+width);
//                int[] right = Arrays.copyOfRange(nums,i+width, i+ 2*width);
//                merger(left,right);
//            }
//        }
//        return nums;
//    }
//
//    public static int[] merger (int[] nums, int start, int end, int width) {
//        int i=start;
//        int j=start + width;
//
//    }

    public static int[] merger (int[] a, int[] b) {
        int[] res = new int[a.length+b.length];
        int i = 0;
        int j = 0;
        int n = 0;
        while(i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                res[n] = b[j];
                j++;
            } else {
                res[n] = a[i];
                i++;
            }
            n++;
        }
        while (i < a.length) {
            res[n] = a[i];
            i++;
            n++;
        }
        while (j < b.length) {
            res[n] = b[j];
            j++;
            n++;
        }
        return res;
    }

    public static void main (String[] args) {
        int[] nums = {9,2,22,45,51,16,14,27,19,25,3,5,1,6,7};
        int[] target = sort(nums);
        for (int i=0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
    }
}
