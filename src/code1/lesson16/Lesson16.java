package code1.lesson16;

import java.text.DecimalFormat;

public class Lesson16 {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1.0 / x;
            N = Math.abs(N);
        }
        if (N == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        double sum = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) {
                sum *= x;
            }

            x *= x;
            N >>>= 1;
        }
        return sum;
    }

    public static void main (String[] args) {
        Lesson16 l = new Lesson16();
        System.out.println(l.myPow(8.88023, 3));
//        System.out.println(444 % 62);
    }
}
