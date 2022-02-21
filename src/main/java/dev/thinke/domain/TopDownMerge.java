package dev.thinke.domain;

import java.util.ArrayList;

public class TopDownMerge<T extends Comparable<T>> implements DivideConquerSort<T> {

    final RunStrategy<T> runStrategy;

    public TopDownMerge(final RunStrategy<T> runStrategy) {
        this.runStrategy = runStrategy;
    }

    public T[] sort(final T[] original) {
        final int n = original.length;
        final var runs = this.runStrategy.createRuns(original);
        final var work = new ArrayList<T>(n);
        while (runs.size() > 0) {
            for (int i = 0; i < runs.size(); i++) {
                this.merge(runs.get(i), runs.get(i + 1), work);
            }
        }
        return original;
    }

    private void merge(final Run thisRun, final Run nextRun, final ArrayList<T> items) {
        final int thisRunSize = thisRun.size();
        final int nextRunSize = nextRun.size();
        final int runLength;
        if (thisRunSize >= nextRunSize) {
            runLength = thisRunSize;
        } else {
            runLength = nextRunSize;
        }
        final var workingItems = new ArrayList<>(thisRunSize + nextRunSize);
        final int thisRunIndex = thisRun.startIndex();
        final int nextRunIndex = nextRun.startIndex();
        for (int i = 1; i <= runLength; i++) {
            final T thisItem = items.get(thisRunIndex);
            final T nextItem = items.get(nextRunIndex);
            final int comp = thisItem.compareTo(nextItem);
            if (comp < 0) {
                workingItems.add(i, thisItem);
                workingItems.add(i + 1, nextItem);
            }
        }
    }
}
