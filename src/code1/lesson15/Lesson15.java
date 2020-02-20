package code1.lesson15;

public class Lesson15 {
    // you need to treat n as an unsigned value
    // 位运算
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
