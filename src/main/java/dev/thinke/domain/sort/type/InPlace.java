package dev.thinke.domain.sort.type;

import dev.thinke.domain.sort.alg.Index;
import dev.thinke.domain.sort.alg.quick.Shell;

import java.util.List;

@FunctionalInterface
public interface InPlace<T extends Comparable<T>> {

    List<T> sort(List<T> original);

    default void swap(Integer first, Integer second, List<T> items) {
        System.out.println("Swapping index " + first + " and " + second);
        final var index = new Index<>(items);
        final T firstItem = index.retrieve(first);
        final T secondItem = index.retrieve(second);
        index.assign(first, secondItem);
        index.assign(second, firstItem);
    }

    default void swap(final Shell shell, final List<T> items) {
        final T firstItem = items.get(shell.left());
        final T secondItem = items.get(shell.right());
        items.set(shell.left(), secondItem);
        items.set(shell.right(), firstItem);
    }
}
