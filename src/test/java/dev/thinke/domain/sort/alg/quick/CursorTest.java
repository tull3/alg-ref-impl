package dev.thinke.domain.sort.alg.quick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CursorTest {

    @Test
    public void testFindLeft() {
        List<String> items = Arrays.asList("f", "z", "a", "m", "o");
        int leftIndex = new Cursor(0, 4).findLeft(items, 4);
        Assertions.assertEquals(1, leftIndex);
    }

    @Test
    public void testFindRight() {
        List<String> items = Arrays.asList("f", "z", "t", "m", "o");
        int rightIndex = new Cursor(0, 4).findRight(items, 4);
        Assertions.assertEquals(3, rightIndex);
    }
}
