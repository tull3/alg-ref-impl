package dev.thinke.domain.data.table;

import org.apache.commons.math3.primes.Primes;

public class StringHashTable implements Table<String> {

    private final String[] values;
    private final Integer n;

    public StringHashTable(int capacity) {
        this.n = Primes.nextPrime(capacity * 2);
        this.values = new String[this.n];
    }

    @Override
    public String get(Object key) {
        int i = deriveKey(key);
        return values[i];
    }

    @Override
    public void put(Object key, String value) {
        int i = deriveKey(key);
        values[i] = value;
    }

    @Override
    public int size() {
        return n;
    }
}
