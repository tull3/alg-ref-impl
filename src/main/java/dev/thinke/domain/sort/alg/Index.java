package dev.thinke.domain.sort.alg;

import java.util.List;

public record Index<T>(List<T> items) {

    private Integer getIndex(final Integer index) {
        return index - 1;
    }

    public T retrieve(final Integer index) {
        return this.items().get(getIndex(index));
    }

    public void assign(final Integer index, final T element) {
        this.items().set(getIndex(index), element);
    }
}
