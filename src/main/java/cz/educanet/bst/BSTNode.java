package cz.educanet.bst;

public class BSTNode<T extends Comparable<T>> implements BinarySearchTree<T> {
    private T data;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(T data) {
        this.data = data;
    }

    @Override
    public void insert(T item) {
        if(item.compareTo(data) > 0) {
            if(right == null) right = new BSTNode<T>(item);
            else right.insert(item);
        } else {
            if(left == null) left = new BSTNode<T>(item);
            else left.insert(item);
        }
    }

    @Override
    public int depth() {
        int leftDepth = left == null ? 0 : left.depth();
        int rightDepth = right == null ? 0 : right.depth();

        return Math.max(leftDepth, rightDepth) + 1;
    }

    @Override
    public boolean contains(T item) {
        if(item == data) return true;
        if(item.compareTo(data) > 0 && right != null) return right.contains(item);
        if(left != null) return left.contains(item);
        return false;
    }
}
