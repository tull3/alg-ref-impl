package dev.thinke.domain;

public record Cursor<T extends Comparable<?>>(int index, T value) {
}
