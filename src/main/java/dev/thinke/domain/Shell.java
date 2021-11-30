package dev.thinke.domain;

public class Shell<T extends Comparable<T>> implements InPlaceSort<T> {

    @Override
    public void sort(final T[] items) {
        final int[] shells = new int[]{6, 3, 1};
        final int n = items.length;
        for (int shell : shells) {
            for (int i = 0; i < n; i++) {
                for (int s = 0; s < n; s += shell) {
                    int next = s + shell;
                    if (next >= n) {
                        break;
                    }
                    T nextValue = items[next];
                    T currentValue = items[s];
                    int comparison = currentValue.compareTo(nextValue);
                    if (comparison > 0) {
                        items[s] = nextValue;
                        items[next] = currentValue;
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
