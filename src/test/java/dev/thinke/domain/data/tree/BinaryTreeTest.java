package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.Item;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    private Tree<String, Integer> treeOne() {
        Tree<String, Integer> treeOne = new Tree<>();
        treeOne.data = new Item<>("one", 1);
        return treeOne;
    }

    private Tree<String, Integer> treeTwo() {
        Tree<String, Integer> treeTwo = new Tree<>();
        treeTwo.data = new Item<>("two", 2);
        return treeTwo;
    }

    private Tree<String, Integer> treeThree() {
        Tree<String, Integer> treeThree = new Tree<>();
        treeThree.data = new Item<>("three", 3);
        return treeThree;
    }

    private Tree<String, Integer> treeFour() {
        Tree<String, Integer> treeFour = new Tree<>();
        treeFour.data = new Item<>("four", 4);
        return treeFour;
    }

    private Tree<String, Integer> treeFive() {
        Tree<String, Integer> treeFive = new Tree<>();
        treeFive.data = new Item<>("five", 5);
        return treeFive;
    }

    private Tree<String, Integer> treeSix() {
        Tree<String, Integer> treeSix = new Tree<>();
        treeSix.data = new Item<>("six", 6);
        return treeSix;
    }

    @Test
    public void testDeleteTwo() {
        var root = treeFour();
        root.left = treeTwo();
        root.left.left = treeOne();
        root.left.right = treeThree();
        root.right = treeSix();
        root.right.left = treeFive();
        var newRoot = new BinaryTree<String, Integer>().delete(root, "two");
        System.out.println(newRoot.data);
        System.out.println(newRoot.right.data);
        System.out.println(newRoot.left.data);
    }

    @Test
    public void testDeleteFour() {
        var root = treeFour();
        root.left = treeTwo();
        root.left.left = treeOne();
        root.left.right = treeThree();
        root.right = treeSix();
        root.right.left = treeFive();
        var newRoot = new BinaryTree<String, Integer>().delete(root, "two");
        System.out.println(newRoot.data);
        System.out.println(newRoot.right.data);
        System.out.println(newRoot.left.data);
    }

    @Test
    public void testDeleteSix() {
        var root = treeFour();
        root.left = treeTwo();
        root.left.left = treeOne();
        root.left.right = treeThree();
        root.right = treeSix();
        root.right.left = treeFive();
        var newRoot = new BinaryTree<String, Integer>().delete(root, "two");
        System.out.println(newRoot.data);
        System.out.println(newRoot.right.data);
        System.out.println(newRoot.left.data);
    }
}
