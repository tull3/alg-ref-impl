package dev.thinke.domain.data.table;

import dev.thinke.domain.util.Math;

public interface Table<T> {

    T get(Object key);

    void put(Object key, T value);

    int size();

    default int deriveKey(Object key) {
        return Math.hash(key) % size();
    }
}
