package dev.thinke.domain.data.type;

public record Item<K extends Comparable<K>, V>(K key, V value) {
}
