package dev.thinke.domain.data.table;

public class HashTable implements Table {

    private int[] keys;
    private Object[] values;

    private int n;
    public HashTable(int capacity) {
        this.keys = new int[capacity];
        this.values = new Object[capacity];
    }

    private int deriveKey(Object key) {
        return (values.length - 1) & hash(key);
    }

    private int hash(Object key) {
        int h;
        return ((h = key.hashCode()) ^ (h >>> 16));
    }

    @Override
    public Object get(Object key) {
        return values[ deriveKey(key) ];
    }

    @Override
    public void put(Object key, Object value) {
        n++;
        values[ deriveKey(key) ] = value;
    }

    @Override
    public int size() {
        return n;
    }
}
