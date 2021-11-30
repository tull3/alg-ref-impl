package dev.thinke.domain;

public class Selection<T extends Comparable<T>> implements InPlaceSort<T> {

    @Override
    public void sort(final T[] items) {
        final int n = items.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            T minValue = items[i];
            for (int s = i + 1; s < n; s++) {
                int comparison = items[minIndex].compareTo(items[s]);
                if (comparison > 0) {
                    minIndex = s;
                    minValue = items[s];
                }
            }
            if (minIndex != i) {
                items[minIndex] = items[i];
                items[i] = minValue;
            }
        }
    }
}
