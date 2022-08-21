package dev.thinke.domain.sort.alg.quick;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class QuickTest {

    @Test
    public void allLowerPartition() {
        List<String> items = Arrays.asList("f", "o", "t", "m", "z");
        int partition = new Quick<String>().partition(items, new Partition(0, items.size() - 1)).index();
        System.out.println(partition);
    }
}
