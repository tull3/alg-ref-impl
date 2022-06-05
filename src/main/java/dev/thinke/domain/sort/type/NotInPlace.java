package dev.thinke.domain.sort.type;

import com.google.common.collect.ImmutableList;

import java.util.List;

public interface NotInPlace<T extends Comparable<T>> {

    ImmutableList<T> sort(List<T> list);
}
