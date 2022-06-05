package dev.thinke.domain.sort.type;

import java.util.List;

public interface InPlace<T extends Comparable<T>> {
    void sort(List<T> original);
}
