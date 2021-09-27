package dev.thinke.domain;

public interface Sorter<T extends Comparable<T>> {
    T[] sort(T[] original);
}
