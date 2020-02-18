package code1.lesson4;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 遍历二维数组,
        // 分3种情况处理，等于：直接返回True，大于：前往下一行，小于：继续遍历本行
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix[0].length) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] < target) {
                    j++;
                } else {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    public boolean findNumberIn2DArray_2(int[][] matrix, int target) {
        // 取最左下角的点为特征点T
        // 如果该值比T大，那么肯定比这列的值都大，排除该列，遍历该行
        // 如果该值比T小，那么肯定比这行的值都小，排除该行，逆序遍历该列
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        code1.lesson4.Solution s = new code1.lesson4.Solution();
        System.out.println(s.findNumberIn2DArray_2(matrix, 5));
        System.out.println(s.findNumberIn2DArray_2(matrix, 20));
    }

}

