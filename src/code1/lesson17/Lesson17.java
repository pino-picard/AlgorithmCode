package code1.lesson17;

import java.util.Date;

public class Lesson17 {
    public int[] printNumbers(int n) {
        int maxValue = 0;
        for (int i = 0; i < n; i++) {
            maxValue += 9 * Math.pow(10,i);
        }
        int[] result = new int[maxValue];
        for (int j = 0; j < maxValue; j++) {
            result[j] = j+1;
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        Lesson17 l = new Lesson17();
        long start = new Date().getTime();
        l.printNumbers(10);
        long stop = new Date().getTime();
        System.out.println(stop - start);
    }
}
