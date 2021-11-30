package dev.thinke.domain;

public class StringSorter implements Sorter<String> {
    private final InPlaceSort<String> sortingStrategy;

    public StringSorter(final InPlaceSort<String> sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    @Override
    public String[] sort(String[] original) {
        sortingStrategy.sort(original);
        return original;
    }
}
