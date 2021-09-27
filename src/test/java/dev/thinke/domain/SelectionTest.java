package dev.thinke.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionTest {

    @Test
    public void selectionStringSort() {
        Selection<String> sorter = new Selection<>();
        String[] items = sorter.sort(new String[]{"me", "testing", "my", "alg"});
        Assertions.assertArrayEquals(new String[]{"alg", "me", "my", "testing"}, items);
    }
}
