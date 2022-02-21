package dev.thinke.domain;

public interface DivideConquerSort<T extends Comparable<? extends T>> {
    T[] sort(T[] original);
}
