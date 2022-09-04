package dev.thinke.domain.data.tree;

public class TreeOperations<T extends Comparable<T>> {

    // O(h)
    public Tree<T> search(Tree<T> tree, T item) {
        if (tree.data.equals(item)) {
            return tree;
        }
        if (item.compareTo(tree.left.data) < 0) {
            return search(tree.left, item);
        } else {
            return search(tree.right, item);
        }
    }

    public Tree<T> minimum(Tree<T> tree) {
        if (tree == null) {
            return null;
        }
        Tree<T> min = tree;
        while(min.left != null) {
            min = min.left;
        }
        return min;
    }

    public Tree<T> maximum(Tree<T> tree) {
        if (tree == null) {
            return null;
        }
        Tree<T> max = tree;
        while(max.right != null) {
            max = max.right;
        }
        return max;
    }

    public void traverse(Tree<T> tree) {
        if (tree != null) {
            traverse(tree.left);
            // do stuff
            traverse(tree.right);
        }
    }

    public void insert(Tree<T> subtree, T item, Tree<T> parent) {
        if (subtree == null) {
            subtree = new Tree<T>();
            subtree.parent = parent;
            subtree.data = item;
            return;
        }
        if (item.compareTo(subtree.data) < 0) {
            insert(subtree.left, item, subtree);
        } else {
            insert(subtree.right, item, subtree);
        }
    }
}
