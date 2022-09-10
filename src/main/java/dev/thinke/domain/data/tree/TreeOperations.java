package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.Item;

import java.util.List;
import java.util.function.Consumer;

public class TreeOperations<K extends Comparable<K>, V> {

    // O(h)
    public V search(LinkedTree tree, K key) {
        if (tree.data.key().equals(key)) {
            return tree.data.value();
        }
        if (key.compareTo(tree.left.data.key()) < 0) {
            return search(tree.left, key);
        } else {
            return search(tree.right, key);
        }
    }

    public V minimum(LinkedTree tree) {
        if (tree == null) {
            return null;
        }
        LinkedTree min = tree;
        while(min.left != null) {
            min = min.left;
        }
        return min.data.value();
    }

    public V maximum(LinkedTree tree) {
        if (tree == null) {
            return null;
        }
        LinkedTree max = tree;
        while(max.right != null) {
            max = max.right;
        }
        return max.data.value();
    }

    public void traverse(LinkedTree tree, Consumer<Item<K, V>> consumer) {
        if (tree != null) {
            traverse(tree.left, consumer);
            consumer.accept(tree.data);
            traverse(tree.right, consumer);
        }
    }

    public void insert(LinkedTree subtree, Item<K, V> item, LinkedTree parent) {
        if (subtree == null) {
            subtree = new LinkedTree();
            subtree.parent = parent;
            subtree.data = item;
            return;
        }
        if (item.key().compareTo(subtree.data.key()) < 0) {
            insert(subtree.left, item, subtree);
        } else {
            insert(subtree.right, item, subtree);
        }
    }

    public void delete(LinkedTree tree) {
        var parent = tree.parent;
        var leftChild = tree.left;
        var rightChild = tree.right;
    }

    private LinkedTree lesser(LinkedTree x, LinkedTree y) {
        int comp = x.data.key().compareTo(y.data.key());
        if (comp < 0) {
            y.left = x;
            x.parent = y;
            return y;
        } else {
            x.right = y;
            y.parent = x;
            return x;
        }
    }

    private class LinkedTree {
        public LinkedTree parent;
        public LinkedTree left;
        public LinkedTree right;
        public Item<K, V> data;
    }

    private class UnlinkedTree {
        public LinkedTree one;
        public LinkedTree two;
        public LinkedTree three;
    }
}
