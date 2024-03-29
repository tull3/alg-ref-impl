package dev.thinke.domain.sort.alg;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public record Range<T extends Comparable<T>>(Index<T> items, Integer startI, Integer endI) {

    public Integer nextThat(Integer lastI, Direction direction, Predicate<T> predicate) {
        Integer next;
        T element;
        do {
            next = direction.next(lastI);
            element = items().retrieve(next);
        } while (!predicate.test(element));
        return next;
    }

    public void forEachWhere(Consumer<T> func, Predicate<T> predicate) {
        for (int i = startI(); i <= endI(); i++) {
            if (predicate.test(items().retrieve(i))) {
                func.accept(items().retrieve(i));
            }
        }
    }

    public void forEach(T element, Consumer<T> func) {
        func.accept(element);
    }

    public Integer size() {
        return (endI() - startI()) + 1;
    }
}
