package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.Item;

import java.util.List;
import java.util.function.Consumer;

public class TreeOperations<K extends Comparable<K>, V> {

    // O(h)
    public V search(LinkedTree linkedTree, K key) {
        if (linkedTree.data.key().equals(key)) {
            return linkedTree.data.value();
        }
        if (key.compareTo(linkedTree.left.data.key()) < 0) {
            return search(linkedTree.left, key);
        } else {
            return search(linkedTree.right, key);
        }
    }

    public V minimum(LinkedTree linkedTree) {
        if (linkedTree == null) {
            return null;
        }
        LinkedTree min = linkedTree;
        while(min.left != null) {
            min = min.left;
        }
        return min.data.value();
    }

    public V maximum(LinkedTree linkedTree) {
        if (linkedTree == null) {
            return null;
        }
        LinkedTree max = linkedTree;
        while(max.right != null) {
            max = max.right;
        }
        return max.data.value();
    }

    public void traverse(LinkedTree linkedTree, Consumer<Item<K, V>> consumer) {
        if (linkedTree != null) {
            traverse(linkedTree.left, consumer);
            consumer.accept(linkedTree.data);
            traverse(linkedTree.right, consumer);
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

    public void delete(LinkedTree linkedTree) {
        LinkedTree parent = linkedTree.parent;
    }

    private LinkedTree link(UnlinkedTree tree) {

    }

    private UnlinkedTree unlink(LinkedTree linkedTree) {

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
