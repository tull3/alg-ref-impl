package dev.thinke.domain.data.tree;

public class Tree<T extends Comparable<T>> {
    public Tree<T> parent;
    public Tree<T> left;
    public Tree<T> right;
    public T data;
}
