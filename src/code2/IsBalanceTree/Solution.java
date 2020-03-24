package code2.IsBalanceTree;

import java.util.Stack;

public class Solution {
    public static boolean isBalanceTree = true;

    public boolean isBalanceTree (Tree root) {
        if (root == null) {
            return true;
        }
        getDep(root);

        return isBalanceTree;
    }

    // 树的深度优先遍历
    public int getDep (Tree root) {
        if (root == null) {
            return 0;
        }

        int left = getDep(root.getLeft());
        int right = getDep(root.getRight());
        int dep = Math.max(left, right) + 1;
        if (Math.abs(left - right) > 1) {
            isBalanceTree = false;
        }
        return dep;
    }

    // 前序遍历
    public void preorder (Tree root) {
        if (root != null) {
            System.out.println(root.val);
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void preorder_norecur (Tree root) {
        Stack<Tree> tmp = new Stack<>();
        if (root != null) {
            tmp.push(root);
            while (!tmp.empty()) {
                Tree curr = tmp.pop();
                System.out.println(curr.val);
                if (curr.getRight() != null) {
                    tmp.push(curr.getRight());
                }
                if (curr.getLeft() != null) {
                    tmp.push(curr.getLeft());
                }
            }
        }
    }

    // 中序遍历
    public void inorder (Tree root) {
        if (root != null) {
            preorder(root.getLeft());
            System.out.println(root.val);
            preorder(root.getRight());
        }
    }

    // 后续遍历
    public void postorder (Tree root) {
        if (root != null) {
            preorder(root.getLeft());
            preorder(root.getRight());
            System.out.println(root.val);
        }
    }
}
