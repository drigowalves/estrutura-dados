package org.example.domain.linkedlist;

public abstract class AbstractLinkedList<T> implements LinkedList<T> {

    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected void incrementerSize() {
        size++;
    }

    protected void decrementerSize() {
        size--;
    }
}
