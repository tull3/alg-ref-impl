package dev.thinke.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleTest {

    @Test
    public void selectionStringSort() {
        var sorter = new Bubble<Integer>();
        var items = new Integer[]{5, 2, 6, 87, 23, 56};
        sorter.sort(items);
        Assertions.assertArrayEquals(new Integer[]{2, 5, 6, 23, 56, 87}, items);
    }
}
