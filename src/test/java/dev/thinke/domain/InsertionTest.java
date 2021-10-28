package dev.thinke.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionTest {

    @Test
    public void selectionStringSort() {
        Insertion<String> sorter = new Insertion<>();
        String[] items = sorter.sort(new String[]{"i", "am", "testing", "b", "b", "b", "b", "b", "glen", "pepper"});
        Assertions.assertArrayEquals(new String[]{"am", "b", "b", "b", "b", "b", "glen", "i", "pepper", "testing"}, items);
    }
}
