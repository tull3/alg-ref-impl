package dev.thinke.domain;

import java.util.List;

public interface RunStrategy<T> {
    List<Run> createRuns(T[] original);
}
