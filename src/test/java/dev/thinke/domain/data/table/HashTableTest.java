package dev.thinke.domain.data.table;

import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void test_get_put() {
        var table = new HashTable(16);
        table.put("one", "one");
        table.put("two", "two");
        table.put("three", "three");

        System.out.println("one: " + table.get("one"));
        System.out.println("two: " + table.get("two"));
        System.out.println("three: " + table.get("three"));
    }
}
