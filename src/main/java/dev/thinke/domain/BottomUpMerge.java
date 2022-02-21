package dev.thinke.domain;

public class BottomUpMerge<T extends Comparable<T>> implements DivideConquerSort<T> {
    public T[] sort(final T[] original) {
        return original;
    }
}
