package code1.lesson14;

public class Lesson14_II {
    // 当n的范围放宽到1000后，int和long就装不下了
    // 此时需要得出当每个因子最接近于3时，乘积才会最大的规律
    public int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        long result = 1L;
        for (int j=0; j < n/3 - 1; j++) {
            result = (result * 3) % 1000000007;
        }

        if (n % 3 == 0) {
            return (int)((result * 3) % 1000000007);
        } else if (n % 3 == 1) {
            return (int)((result * 4) % 1000000007);
        } else {
            return (int)((result * 6) % 1000000007);
        }

    }
}
