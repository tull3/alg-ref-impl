package dev.thinke.domain;

public interface SortingAlg<T extends Comparable<T>> {
    void sort(T[] original);
}
