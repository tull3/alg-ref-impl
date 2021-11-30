package dev.thinke.domain;

public class Insertion<T extends Comparable<T>> implements InPlaceSort<T> {

    @Override
    public void sort(final T[] items) {
        final int n = items.length;
        for (int i = 0; i < n; i++) {
            for (int s = i; s > 0; s--) {
                int next = s - 1;
                T nextValue = items[next];
                T currentValue = items[s];
                int comparison = currentValue.compareTo(nextValue);
                if (comparison < 0) {
                    items[s] = nextValue;
                    items[next] = currentValue;
                } else {
                    break;
                }
            }
        }
    }
}
