package dev.thinke.domain;

public class Bubble<T extends Comparable<T>> implements SortingAlg<T> {

    @Override
    public T[] sort(final T[] items) {
        // {5, 2, 6, 87, 23, 56}
        // compare 0, 1
        // swap because 5 is greater than 2
        // compare 1, 2
        // don't swap because 6 is greater than 5
        // compare 2, 3
        // don't swap because 87 is greater than 6
        // compare 3, 4
        // swap because 87 is greater than 23
        // compare 4, 5
        // swap because 87 is greater than 56
        // restart with n - 1
        final int n = items.length;
        for (int i = n; i > 0; i--) {
//            int minIndex = i;
//            T minValue = items[i];
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
        return items;
    }
}
