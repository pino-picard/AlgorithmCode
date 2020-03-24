package code1.lesson20;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson20 {

    public boolean isNumber(String s) {
        String tmp = s.trim();
        if (tmp.length() == 0) {
            return false;
        } else {
            return tmp.matches("^[+-]?(\\d+\\.?|\\.\\d+|\\d+\\.\\d+)([eE][-+]?\\d+)?");
        }
    }

    public boolean checkFloat(String s) {
        //如果存在. 则按浮点数处理，否则按整数处理
        if (s.contains(".")) {
            String[] parts = s.split("\\.");
            boolean checkPart2 = true;
            //浮点数切分后，第一部分按整数处理，第二部分按无符号整数处理
            for (int i = 0; i < parts[1].length(); i++) {
                char curr = parts[1].charAt(i);
                if (!(curr >= '0' && curr <= '9')) {
                    checkPart2 = false;
                }
            }
            return (parts[0].length() != 0 || parts[2].length() != 0) && (checkInteger(parts[0]) && checkPart2);
        } else {
            return checkInteger(s);
        }
    }

    public boolean checkInteger(String s) {
        if (s.equals("+") || s.equals("-")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0 && (curr == '+' || curr == '-')) {
                continue;
            }
            if (!(curr >= '0' && curr <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lesson20 l = new Lesson20();
        // 正则表达式写法
        String pattern = "^[+-]?(\\d+\\.?|\\.\\d+|\\d+\\.\\d+)([eE][-+]?\\d+)?";
        System.out.println(Pattern.matches(pattern,"+100e-32"));
//        System.out.println(l.checkFloat("+1."));
//        System.out.println(l.checkFloat(".1"));
//        System.out.println(l.checkFloat("."));
//        System.out.println(l.checkFloat("1.1"));
//        System.out.println(l.checkFloat("+123"));
//        System.out.println(l.checkFloat("-123"));
    }
}
