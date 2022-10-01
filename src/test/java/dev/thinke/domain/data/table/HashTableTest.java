package dev.thinke.domain.data.table;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void test_get_put() {
        var table = new StringHashTable(16);
        table.put("one", "one");
        table.put("two", "two");
        table.put("three", "three");
        table.put("four", "four");
        table.put("five", "five");

        Assertions.assertEquals("one", table.get("one"));
        Assertions.assertEquals("two", table.get("two"));
        Assertions.assertEquals("three", table.get("three"));
        Assertions.assertEquals("four", table.get("four"));
        Assertions.assertEquals("five", table.get("five"));
    }
}
