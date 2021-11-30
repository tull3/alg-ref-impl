package dev.thinke.domain;

public interface InPlaceSort<T extends Comparable<T>> {
    void sort(T[] original);
}
