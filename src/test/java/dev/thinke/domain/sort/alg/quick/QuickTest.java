package dev.thinke.domain.sort.alg.quick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class QuickTest {

    @Test
    public void allLowerPartition() {
        List<String> items = Arrays.asList("a", "o", "t", "f", "z", "m", "l", "s", "e", "r");
        int partition = new Quick<String>(PartitionStrategy.LAST).partition(items, new Partition(1, items.size())).index();
        System.out.println(partition);
        items.forEach(System.out::println);
    }

    @Test
    public void sortAll() {
        List<String> items = Arrays.asList("a", "o", "t", "f", "z", "m", "l", "s", "e", "r");
        List<String> result = Arrays.asList("a", "e", "f", "l", "m", "o", "r", "s", "t", "z");
        new Quick<String>(PartitionStrategy.LAST).sort(items);
        Assertions.assertEquals(result, items);
    }
}
