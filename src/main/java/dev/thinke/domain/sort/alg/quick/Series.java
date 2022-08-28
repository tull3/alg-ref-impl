package dev.thinke.domain.sort.alg.quick;

import java.util.Set;

/**
 * By nature, a series is consecutive, ordered element indexes
 */
public record Series(Set<Integer> indexes) {
}
