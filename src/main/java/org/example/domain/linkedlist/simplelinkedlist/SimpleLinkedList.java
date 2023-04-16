package org.example.domain.linkedlist.simplelinkedlist;

import org.example.domain.linkedlist.AbstractLinkedList;

import java.util.Objects;

public class SimpleLinkedList<T> extends AbstractLinkedList<T> {

    private Node<T> node;

    @Override
    public void add(T value) {
        var newNode = new Node<>(value);
        if (Objects.isNull(node)) {
            this.node = newNode;
        } else {
            var lastNode = getLastNode();
            lastNode.setTail(newNode);
        }
        incrementerSize();
    }

    @Override
    public void removeHead() {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        else {
            node = node.getTail();
            decrementerSize();
        }
    }

    @Override
    public void removeTail() {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        else if (Objects.isNull(node.getTail())) {
            node = null;
        } else {
            var penultimateNode = getPenultimateNode();
            penultimateNode.clearTail();
        }
        decrementerSize();
    }

    @Override
    public int indexOf(T value) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    private Node<T> getLastNode() {
        var lastNode = node;

        while (Objects.nonNull(lastNode.getTail())) lastNode = lastNode.getTail();

        return lastNode;
    }

    private Node<T> getPenultimateNode() {
        var auxNode = node;

        while (Objects.nonNull(auxNode.getTail().getTail())) auxNode = auxNode.getTail();

        return auxNode;
    }

}
