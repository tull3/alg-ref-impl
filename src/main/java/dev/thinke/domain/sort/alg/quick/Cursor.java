package dev.thinke.domain.sort.alg.quick;

import java.util.List;

public class Cursor {

    private int leftIndex;
    private int rightIndex;

    public Cursor(int leftIndex, int rightIndex) {
        this.leftIndex = leftIndex;
        this.rightIndex = rightIndex;
    }

    public boolean crossed() {
        return leftIndex >= rightIndex;
    }

    private int getLeftIndex() {
        return this.leftIndex;
    }

    private int getRightIndex() {
        return this.rightIndex;
    }

    private void increment() {
        leftIndex++;
    }

    private void decrement() {
        rightIndex--;
    }

    public <T extends Comparable<T>> Integer findLeft(final List<T> items, int pivot) {
        final T pivotItem = items.get(pivot);
        if (crossed()) {
            return getLeftIndex();
        }
        boolean foundLeft = false;
        while (!foundLeft && !crossed()) {
            final T item = items.get(getLeftIndex());
            if ((item != pivotItem) && (item.compareTo(pivotItem) > 0)) {
                foundLeft = true;
            } else {
                increment();
            }
        }
        return getLeftIndex();
    }

    public <T extends Comparable<T>> int findRight(final List<T> items, int pivot) {
        final T pivotItem = items.get(pivot);
        if (crossed()) {
            return getRightIndex();
        }
        boolean foundRight = false;
        while (!foundRight && !crossed()) {
            final T item = items.get(getRightIndex());
            if ((item != pivotItem) && (item.compareTo(pivotItem) < 0)) {
                foundRight = true;
            } else {
                decrement();
            }
        }
        return getRightIndex();
    }
}
