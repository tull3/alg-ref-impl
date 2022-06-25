package dev.thinke.domain.sort.alg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class SelectionTest {

    @Test
    public void selectionStringSort() {
        var sorter = new Selection<String>();
        var items = new String[]{"me", "testing", "my", "alg"};
        Assertions.assertArrayEquals(
                new String[]{"alg", "me", "my", "testing"},
                sorter.sort(Arrays.asList(items)).toArray());
    }
}
