package dev.thinke.domain.data.tree;

import com.google.common.base.Objects;
import dev.thinke.domain.data.type.DictionaryItem;
import dev.thinke.domain.data.type.PriorityQueue;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class BinaryTree<K extends Comparable<K>, V> implements PriorityQueue<K, V> {

    private final Tree<K, V> root;
    private final AtomicInteger size = new AtomicInteger(0);

    public BinaryTree(final DictionaryItem<K, V> item) {
        this.root = new Tree<>();
        this.root.data = item;
        this.root.nodeType = NodeType.ROOT;
    }

    public BinaryTree(final Tree<K, V> tree) {
        this.root = tree;
        this.root.nodeType = NodeType.ROOT;
    }

    // O(h)
    private V search(final Tree<K, V> tree, final K key) {
        if (tree == null) {
            return null;
        }
        int comp = key.compareTo(tree.data.key());
        if (comp == 0) {
            return tree.data.value();
        } else {
            if (comp < 0) {
                return search(tree.left, key);
            } else {
                return search(tree.right, key);
            }
        }
    }

    private V minimum(final Tree<K, V> tree) {
        if (tree == null) {
            return null;
        }
        var min = tree;
        while(min.left != null) {
            min = min.left;
        }
        return min.data.value();
    }

    private V maximum(final Tree<K, V> tree) {
        if (tree == null) {
            return null;
        }
        var max = tree;
        while(max.right != null) {
            max = max.right;
        }
        return max.data.value();
    }

    private void traverse(final Tree<K, V> tree, final Consumer<DictionaryItem<K, V>> consumer) {
        if (tree != null) {
            traverse(tree.left, consumer);
            consumer.accept(tree.data);
            traverse(tree.right, consumer);
        }
    }

    private void insert(final Tree<K, V> subtree, final DictionaryItem<K, V> item) {
        if (item.key().compareTo(subtree.data.key()) < 0) {
            if (subtree.left == null) {
                subtree.left = new Tree<>();
                subtree.left.parent = subtree;
                subtree.left.data = item;
                subtree.left.nodeType = NodeType.LEFT;
                this.size.incrementAndGet();
            } else {
                insert(subtree.left, item);
            }
        } else {
            if (subtree.right == null) {
                subtree.right = new Tree<>();
                subtree.right.parent = subtree;
                subtree.right.data = item;
                subtree.nodeType = NodeType.RIGHT;
                this.size.incrementAndGet();
            } else {
                insert(subtree.right, item);
            }
        }
    }

    private void delete(final Tree<K, V> tree, K key) {
        if (tree == null) {
            return;
        }
        int comp = key.compareTo(tree.data.key());
        if (comp < 0) {
            delete(tree.left, key);
        } else if (comp > 0) {
            delete(tree.right, key);
        } else {
            if (tree.isLeaf()) {
                var parent = tree.parent;
                if (NodeType.LEFT.equals(tree.nodeType)) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (tree.right != null) {
                if (tree.right.isLeaf()) {
                    tree.data = tree.right.data;
                    tree.right = null;
                } else {
                    tree.data = extractMin(tree.right);
                }
            } else {
                tree.data = tree.left.data;
                tree.left = null;
            }
            this.size.decrementAndGet();
        }
    }

    /**
     * Only useful when deleting a node
     * @param tree
     * @return
     */
    private DictionaryItem<K, V> extractMin(final Tree<K, V> tree) {
        if (tree.left == null) { // reached min node in this tree
            var min = tree.data;
            if (tree.right == null) { // this is a leaf; cut it
                tree.parent.left = null;
            } else { // find min in right tree to reassign value here; eventually it'll hit one of the above two cases
                tree.data = extractMin(tree.right);
            }
            this.size.decrementAndGet();
            return min;
        } else {
            return extractMin(tree.left);
        }
    }

    protected Tree<K, V> root() {
        return root;
    }

    @Override
    public V search(final K key) {
        return search(root, key);
    }

    @Override
    public void insert(final K key, final V value) {
        insert(root, new DictionaryItem<>(key, value));
    }

    @Override
    public void delete(final K key) {
        delete(root, key);
    }

    @Override
    public V max() {
        return maximum(root);
    }

    @Override
    public V min() {
        return minimum(root);
    }

    @Override
    public V previous(final K key) {
        return null;
    }

    @Override
    public V next(final K key) {
        return null;
    }

    @Override
    public Integer size() {
        return this.size.get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryTree<?, ?> that = (BinaryTree<?, ?>) o;
        return Objects.equal(root, that.root);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(root);
    }
}
