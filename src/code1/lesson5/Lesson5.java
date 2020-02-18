package code1.lesson5;

public class Lesson5 {
    public String replaceSpace(String s) {
        //
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "We are happy.";
        Lesson5 l = new Lesson5();
        System.out.println(l.replaceSpace(s));
    }
}
