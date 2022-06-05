package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.alg.Insertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionTest {

    @Test
    public void selectionStringSort() {
        var sorter = new Insertion<String>();
        var items = new String[]{"i", "am", "testing", "b", "b", "b", "b", "b", "glen", "pepper"};
        sorter.sort(items);
        Assertions.assertArrayEquals(new String[]{"am", "b", "b", "b", "b", "b", "glen", "i", "pepper", "testing"}, items);
    }
}
