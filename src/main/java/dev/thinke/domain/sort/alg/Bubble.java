package dev.thinke.domain.sort.alg;

import dev.thinke.domain.sort.type.InPlace;

import java.util.List;

public class Bubble<T extends Comparable<T>> implements InPlace<T> {

    @Override
    public void sort(final List<T> items) {
        final int n = items.size();
        for (int i = n; i > 0; i--) {
            for (int s = 1; s < i; s++) {
                T first = items.get(s - 1);
                T second = items.get(s);
                int comparison = first.compareTo(second);
                if (comparison > 0) {
                    items.set(s - 1, second);
                    items.set(s, first);
                }
            }
        }
    }
}
