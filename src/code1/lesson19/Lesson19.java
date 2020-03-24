package code1.lesson19;


public class Lesson19 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {   // 先判断边界情况，如果s 为 null或者 p 为 null ，则返回false
            return false;
        }

        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;        // 如果s,p长度为0，则返回true

        //初始化第一行
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                char ns = s.charAt(i-1);
                char np = p.charAt(j-1);
                if (np == ns || np == '.') {
                    dp[i][j] = dp[i-1][j-1];
                } else if (np == '*') {
                    //当np为*时，判断前一个字符是否相等或者为'.'
                    if (p.charAt(j-2) == ns || p.charAt(j-2) == '.') {
                        //如果前一个字符相等，那么*次数可能为0,1和多次
                        dp[i][j] = dp[i][j-2] || dp[i][j-1] || dp[i-1][j];
                    } else {    //如果前一个字符不等，那么*次数为0,
                        dp[i][j] = dp[i][j-2];
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        Lesson19 l = new Lesson19();
        System.out.println(l.isMatch("aab","c*a*b*"));
    }
}
