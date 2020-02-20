package code1.lesson14;

public class Lesson14 {
    public int cuttingRope(int n) {
        // 对于绳子而言，可以被切为2段到n段
        int max = 0;
        for (int j = 2; j <= n; j++) {
            max = Math.max(max, maxMulti(j, n));
        }
        return max % 1000000008;
    }

    // 已知绳子被切为m段
    public int maxMulti(int m, int n){
        int mid = n / m;
        int r = n % m;
        int sum = 1;
        for (int i = 0; i < r; i++) {
            sum *= mid + 1;
        }
        for (int j = 0; j < m - r; j++) {
            sum *= mid;
        }
        return sum;
    }

    public static void main(String[] args){
        Lesson14 l = new Lesson14();
        System.out.println(l.cuttingRope(58));
    }
}
