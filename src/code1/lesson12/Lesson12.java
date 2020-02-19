package code1.lesson12;

import java.util.*;

public class Lesson12 {
    public boolean exist(char[][] board, String word) {
        HashSet<String> set = new HashSet<>();
        char[] words = word.toCharArray();
        boolean[][] visit = new boolean[board.length][board[0].length];

        for (int i = 0;i < board.length; i++) {
            for (int j =0; j < board[0].length; j++) {
                visit[i][j] = false;
                if (board[i][j] == words[0]) {
                    set.add(i+","+j);
                }
            }
        }

        if(set.isEmpty()){
            return false;
        } else {
            Iterator<String> iter = set.iterator();
            while(iter.hasNext()){
                String cur = iter.next();
                String[] position = cur.split(",");
                int x = Integer.valueOf(position[0]);
                int y =  Integer.valueOf(position[1]);
                visit[x][y] = true;
                if(recur(board, visit, x, y, Arrays.copyOfRange(words, 1, words.length))){
                    return true;
                }
                visit[x][y] = false;
            }
        }
        return false;
    }

    // 第二版
    // TODO 可以继续优化
    public boolean recur(char[][] board, boolean[][] visit, int x, int y, char[] word){
        if(word.length == 0){
            return true;
        }

        if(x - 1 >= 0 && !visit[x - 1][y] && word[0] == board[x - 1][y]){
            visit[x - 1][y] = true;
            if(recur(board, visit, x-1, y, Arrays.copyOfRange(word, 1, word.length))){
                return true;
            } else {
                visit[x - 1][y] = false;
            }
        }
        if(y - 1 >= 0 && !visit[x][y - 1] && word[0] == board[x][y - 1]){
            visit[x][y - 1] = true;
            if(recur(board, visit, x, y-1, Arrays.copyOfRange(word, 1, word.length))){
                return true;
            } else {
                visit[x][y - 1] = false;
            }
        }
        if(x + 1 < board.length && !visit[x+1][y] && word[0] == board[x + 1][y]){
            visit[x+1][y] = true;
            if(recur(board, visit, x+1, y, Arrays.copyOfRange(word, 1, word.length))){
                return true;
            } else {
                visit[x+1][y] = false;
            }
        }
        if(y + 1 < board[0].length && !visit[x][y+1] && word[0] == board[x][y+1]){
            visit[x][y+1] = true;
            if(recur(board, visit, x, y+1, Arrays.copyOfRange(word, 1, word.length))){
                return true;
            } else {
                visit[x][y+1] = false;
            }
        }
        return false;
    }

    // 第一版超时了  =。=
//    public boolean recur(char[][] board, HashSet<String> pre, int x, int y, char[] word){
//        if(word.length == 0){
//            return true;
//        }
//        boolean a = false;
//        boolean b = false;
//        boolean c = false;
//        boolean d = false;
//        if(x - 1 >= 0 && !pre.contains((x - 1) + "," + y) && word[0] == board[x - 1][y]){
//            HashSet<String> right = new HashSet<>(pre);
//            right.add((x - 1) + "," + y);
//            a = recur(board, right, x-1, y, Arrays.copyOfRange(word, 1, word.length));
//        }
//        if(y - 1 >= 0 && !pre.contains(x + "," + (y-1)) && word[0] == board[x][y - 1]){
//            HashSet<String> down = new HashSet<>(pre);
//            down.add(x + "," + (y -1 ));
//            b = recur(board, down, x, y-1, Arrays.copyOfRange(word, 1, word.length));
//        }
//        if(x + 1 < board.length && !pre.contains((x + 1) + "," + y) && word[0] == board[x + 1][y]){
//            HashSet<String> left = new HashSet<>(pre);
//            left.add((x + 1) + "," + y);
//            c = recur(board, left, x+1, y, Arrays.copyOfRange(word, 1, word.length));
//        }
//        if(y + 1 < board[0].length && !pre.contains(x + "," + (y+1)) && word[0] == board[x][y+1]){
//            HashSet<String> up = new HashSet<>(pre);
//            up.add(x + "," + (y+1));
//            d = recur(board, up, x, y+1, Arrays.copyOfRange(word, 1, word.length));
//        }
//        return a || b || c || d;
//    }

    public static void main(String[] args){
//        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
//        String word = "ABCESEEEFS";
        char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        String word = "AAB";
        Lesson12 l = new Lesson12();
        System.out.println(l.exist(board, word));

    }
}
