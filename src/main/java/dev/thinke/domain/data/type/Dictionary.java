package dev.thinke.domain.data.type;

public interface  Dictionary<K extends Comparable<K>, V> {
    V search(K key);
    void insert(K key, V value);
    void delete(K key);
}
