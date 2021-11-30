package dev.thinke.domain;

public class Bubble<T extends Comparable<T>> implements InPlaceSort<T> {

    @Override
    public void sort(final T[] items) {
        final int n = items.length;
        for (int i = n; i > 0; i--) {
            for (int s = 1; s < i; s++) {
                T first = items[s - 1];
                T second = items[s];
                int comparison = first.compareTo(second);
                if (comparison > 0) {
                    items[s - 1] = second;
                    items[s] = first;
                }
            }
        }
    }
}
