package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.alg.Selection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SelectionTest {

    @Test
    public void selectionStringSort() {
        var sorter = new Selection<String>();
        var items = new String[]{"me", "testing", "my", "alg"};
        sorter.sort(items);
        Assertions.assertArrayEquals(new String[]{"alg", "me", "my", "testing"}, items);
    }
}
