package code1.lesson10;

public class Lesson10 {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long[] nums = new long[n+1];
            nums[0] = 0;
            nums[1] = 1;
            for (int i = 2; i <= n ; i++){
                nums[i] = (nums[i-1] + nums[i-2]) % 1000000007;
            }
            return (int)nums[n];
        }
    }

    public static void main(String[] args) {
        Lesson10 l = new Lesson10();
        System.out.println(l.fib(100));
    }
}
