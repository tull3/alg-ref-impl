package dev.thinke.domain;

public class StringSorter implements Sorter<String> {
    private final SortingAlg<String> sortingStrategy;

    public StringSorter(final SortingAlg<String> sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    @Override
    public String[] sort(String[] original) {
        sortingStrategy.sort(original);
        return original;
    }
}
