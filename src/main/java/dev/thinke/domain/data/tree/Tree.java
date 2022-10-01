package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.Item;

class Tree<K extends Comparable<K>, V> {
    public Tree<K, V> parent;
    public Tree<K, V> left;
    public Tree<K, V> right;
    public Item<K, V> data;
}
