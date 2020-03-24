package code2.IsBalanceTree;

public class Tree {
    private Tree left;
    private Tree right;
    public int val;

    public Tree (int val) {
        this.val = val;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }


    public void setRight(Tree right) {
        this.right = right;
    }
}
