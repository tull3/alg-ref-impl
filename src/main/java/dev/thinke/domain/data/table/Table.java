package dev.thinke.domain.data.table;

public interface Table {

    Object get(Object key);

    void put(Object key, Object value);

    int size();
}
