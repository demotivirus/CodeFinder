package Generics.Theory.Example_08;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
