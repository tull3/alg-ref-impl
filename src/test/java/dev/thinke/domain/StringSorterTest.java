package dev.thinke.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSorterTest {

    @Test
    public void sorterTest() {
        var sortingAlg = new InPlaceSort<String>() {
            @Override
            public void sort(String[] original) {}
        };
        var sorter = new StringSorter(sortingAlg);
        var testArray = new String[]{};
        Assertions.assertArrayEquals(testArray, sorter.sort(testArray));
    }
}
