package dev.thinke.domain.sort.alg.quick;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public record Partition(Integer startIndex, Integer endIndex) {

    public Integer size() {
        return (this.endIndex - this.startIndex) + 1;
    }
}
