package dev.thinke.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ShellTest {

    @Test
    public void selectionStringSort() {
        var sorter = new Selection<String>();
        var items = new String[]{"me", "testing", "my", "alg", "my"};
        sorter.sort(items);
        Assertions.assertArrayEquals(new String[]{"alg", "me", "my", "my", "testing"}, items);
    }
}
