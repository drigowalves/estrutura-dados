package org.example.domain.linkedlist;

public interface LinkedList<T> {

    void add(T value);
    void removeHead();
    void removeTail();
    int indexOf(T value);
    T get(int index);
    int size();
    boolean isEmpty();

}
