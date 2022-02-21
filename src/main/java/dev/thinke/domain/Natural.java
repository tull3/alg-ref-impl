package dev.thinke.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Natural<T> implements RunStrategy<T> {

    @Override
    public List<Run> createRuns(T[] original) {
        final var runs = new LinkedList<Run>();
        final int n = original.length;
        final var items = new ArrayList<T>(n);
        final int endOfLastRun = 0;
        for (int i = 0; i < n; i++) {
            T item = original[i];
            int currentRun = i - 0;
            for (int s = endOfLastRun; s <= i; s++) {
                
            }
        }
        return runs;
    }
}
