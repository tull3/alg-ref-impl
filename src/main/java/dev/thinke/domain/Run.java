package dev.thinke.domain;

public record Run(Integer startIndex, Integer endIndex) {

    public Integer size() {
        return endIndex.intValue() - startIndex.intValue() + 1;
    }
}
