package code1.lesson10_1;

public class Lesson10 {
    public int numWays(int n) {
        if(n == 0) {    // 阶梯为0时，跳法为1
            return 1;
        } else if (n == 1) {    // 阶梯为1时，跳法为1
            return 1;
        } else {
            long[] nums = new long[n+1];
            nums[0] = 1;
            nums[1] = 1;
            for (int i = 2; i <= n ; i++){  // 阶梯为2时，跳法f(2) = f(2-1) + f(2-2),依次类推
                nums[i] = (nums[i-1] + nums[i-2]) % 1000000007;
            }
            return (int)nums[n];
        }
    }

    public static void main(String[] args) {
        Lesson10 l = new Lesson10();
        System.out.println(l.numWays(7));
    }
}
