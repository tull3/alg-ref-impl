package dev.thinke.domain.data.tree;

import dev.thinke.domain.data.type.DictionaryItem;

class Tree<K extends Comparable<K>, V> {
    public Tree<K, V> parent;
    public Tree<K, V> left;
    public Tree<K, V> right;
    public DictionaryItem<K, V> data;
}
