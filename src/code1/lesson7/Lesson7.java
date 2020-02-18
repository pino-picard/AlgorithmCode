package code1.lesson7;

import java.util.Arrays;
import java.util.HashMap;

public class Lesson7 {

    private HashMap<Integer,Integer> reverses;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        reverses = new HashMap<>(inorder.length);
        for (int i = 0; i < inorder.length; i++) {
            reverses.put(inorder[i], i);
        }
        return recur(preorder, inorder);
    }

    public TreeNode recur(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        } else {
            TreeNode treeNode = new TreeNode(preorder[0]);
            int c = reverses.get(preorder[0]);
            int[] in_left = Arrays.copyOfRange(inorder, 0, c);
            int[] in_right = Arrays.copyOfRange(inorder, c + 1, inorder.length);
            treeNode.left = buildTree(Arrays.copyOfRange(preorder, 1, in_left.length + 1), in_left);
            treeNode.right = buildTree(Arrays.copyOfRange(preorder, in_left.length + 1, inorder.length), in_right);
            return treeNode;
        }
    }

    public static void main(String[] args){
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Lesson7 l = new Lesson7();
        System.out.println(l.buildTree(preorder, inorder));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(preorder, 4, 5)));
    }
}

