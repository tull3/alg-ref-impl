package dev.thinke.domain.sort.type;

import java.util.List;

@FunctionalInterface
public interface InPlace<T extends Comparable<T>> {

    List<T> sort(List<T> original);
}
