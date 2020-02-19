package code1.lesson13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Lesson13 {
    public int movingCount(int m, int n, int k) {
        int count = 0;
        if(k==0){
            return 1;
        }
        LinkedList<String> list = new LinkedList<>();
        HashSet<String> marked = new HashSet<>();
        list.add(0+","+0);
        while(!list.isEmpty()){
            String position = list.pollFirst();
            int row = Integer.parseInt(position.split(",")[0]);
            int col = Integer.parseInt(position.split(",")[1]);
            if (!marked.contains(row+ "," + col) && digitSum(row) + digitSum(col) <= k) {
                count++;
                marked.add(row+ "," + col);
                if (row+1 < m) {
                    list.add((row + 1) + "," + col);
                }
                if (col+1 < n) {
                    list.add(row + "," + (col + 1));
                }
            }
        }
        return count;
    }


    public int digitSum (int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int k = 1;
        Lesson13 l = new Lesson13();
        System.out.println(l.movingCount(m, n, k));

    }
}
