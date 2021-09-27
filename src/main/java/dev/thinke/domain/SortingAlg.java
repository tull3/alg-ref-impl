package dev.thinke.domain;

public interface SortingAlg<T extends Comparable<T>> {
    T[] sort(T[] original);
}
