package dev.thinke.domain.sort.alg.quick;

import dev.thinke.domain.sort.type.InPlace;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Quick<T extends Comparable<T>> implements InPlace<T> {
    @Override
    public List<T> sort(final List<T> items) {
        sort(items, new Partition(0, items.size() - 1));
        return items;
    }

    public Pivot partition(final List<T> items, final Partition partition) {
        int lo = partition.startIndex();
        int hi = partition.endIndex() + 1;
        T pivotItem = items.get(lo);
        while (true) {
            while (less(items.get(++lo), pivotItem)) {
                if (lo == hi) break;
            }
            while (less(items.get(--hi), pivotItem)) {
                if (hi == lo) break;
            }
            if (lo >= hi) break;
            swap(lo, hi, items);
        }
        swap(partition.startIndex(), hi, items);
        return new Pivot(hi);
    }

    private int defaultPartitionIndex(int size) {
        return size - 1;
    }

    private boolean less(T comparer, T comparee) {
        System.out.println("Comparing " + comparer.toString() + " to " + comparee.toString());
        return comparer.compareTo(comparee) < 0;
    }

    private void sort(final List<T> items, final Partition partition) {
        if (partition.size() <= 1) {
            return;
        }
        final var pivot = partition(items, partition);
        sort(items, new Partition(partition.startIndex(), pivot.index() - 1));
        sort(items, new Partition(pivot.index() + 1, partition.endIndex()));
    }
}
