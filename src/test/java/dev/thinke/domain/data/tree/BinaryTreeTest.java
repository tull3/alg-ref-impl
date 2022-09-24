package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.DictionaryItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    private DictionaryItem<Integer, String> treeOne() {
        return new DictionaryItem<>(1, "one");
    }

    private DictionaryItem<Integer, String> treeTwo() {
        return new DictionaryItem<>(2, "two");
    }

    private DictionaryItem<Integer, String> treeThree() {
        return new DictionaryItem<>(3, "three");
    }

    private DictionaryItem<Integer, String> treeFour() {
        return new DictionaryItem<>(4, "four");
    }

    private DictionaryItem<Integer, String> treeFive() {
        return new DictionaryItem<>(5, "five");
    }

    private DictionaryItem<Integer, String> treeSix() {
        return new DictionaryItem<>(6, "six");
    }

    private BinaryTree<Integer, String> buildTree() {
        var root = new BinaryTree<>(treeFour());
        root.insert(treeTwo().key(), treeTwo().value());
        root.insert(treeOne().key(), treeOne().value());
        root.insert(treeThree().key(), treeThree().value());
        root.insert(treeSix().key(), treeSix().value());
        root.insert(treeFive().key(), treeFive().value());
        return root;
    }

    @Test
    public void testTreeOne() {
        var root = buildTree();
        assertEquals("one", root.min());
        assertEquals("six", root.max());
        root.delete(6);
        assertEquals("five", root.max());
        root.delete(1);
        assertEquals("two", root.min());
    }

    @Test
    public void testTreeTwo() {
        var root = buildTree();
        assertEquals("five", root.search(5));
        root.delete(5);
        assertNull(root.search(5));
        assertEquals("six", root.max());
        assertEquals("three", root.search(3));
        root.delete(3);
        assertNull(root.search(3));
        assertEquals("one", root.min());
    }
}
