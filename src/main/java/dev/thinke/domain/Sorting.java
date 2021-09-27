package dev.thinke.domain;

import java.util.Arrays;
import java.util.LinkedList;

public class Sorting {
    
    public static String[] selectionSort(final String[] original) {
        final var length = original.length;
        final var sorted = new String[length];
//        int index = 0;
//        for (int i = 0; i < length; i++) {
//
//            for (String item : original) {
//                if (item == null) continue;
//                int comparison = first.compareToIgnoreCase(item);
//                if (comparison > 0) {
//                    first = item;
//                }
//            }
//            original.remove(first);
//            sorted.add(i - index, first);
//        }
        return sorted;
    }

    public static LinkedList<String> bubbleSort(final LinkedList<String> original) {
        final int size = original.size();
        final var sorted = new LinkedList<String>();
        for (int i = size; i > 0; i--) {
            final String last = original.pollLast();
            if (original.isEmpty()) {
                sorted.addLast(last);
                continue;
            }
            final String second = original.get(i - 2);
            final int comparison = last.compareToIgnoreCase(second);
            if (comparison <= 0) {
                sorted.addFirst(last);
            } else {
                sorted.addFirst(second);
                original.set(i - 2, last);
            }
        }

        return sorted;
    }

    public static int[] mergeSort(final int[] original) {
        final int[] sorted = Arrays.copyOf(original, original.length);

        return new int[5];
    }
}
