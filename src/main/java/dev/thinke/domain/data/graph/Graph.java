package dev.thinke.domain.data.graph;

public class Graph<T extends Comparable<T>> {
    Vector<T> vector = new Vector<>();

    public void traverse() {

    }
    private static class Vector<T> {
        public T item;
    }
    private static class Edge<T> {
        public Vector<T> x;
        public Vector<T> y;
        public Integer weight;
        public Boolean directed;
    }
}
