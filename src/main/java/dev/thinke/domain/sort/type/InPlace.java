package dev.thinke.domain.sort.type;

import dev.thinke.domain.sort.alg.quick.Shell;

import java.util.List;

@FunctionalInterface
public interface InPlace<T extends Comparable<T>> {

    List<T> sort(List<T> original);

    default void swap(int first, int second, List<T> items) {
        System.out.println("Swapping index " + first + " and " + second);
        final T firstItem = items.get(first);
        final T secondItem = items.get(second);
        items.set(first, secondItem);
        items.set(second, firstItem);
    }

    default void swap(final Shell shell, final List<T> items) {
        final T firstItem = items.get(shell.left());
        final T secondItem = items.get(shell.right());
        items.set(shell.left(), secondItem);
        items.set(shell.right(), firstItem);
    }
}
