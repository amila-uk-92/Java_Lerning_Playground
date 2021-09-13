package test.tree;

class BinaryTreeTest1 {

    public static void main(String args[]){

    }
}

class TreeNode{

    private TreeNode left;
    private TreeNode right;
    private String data;

    public TreeNode(String data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}