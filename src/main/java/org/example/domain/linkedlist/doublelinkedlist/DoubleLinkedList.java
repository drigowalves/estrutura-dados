package org.example.domain.linkedlist.doublelinkedlist;

import org.example.domain.linkedlist.AbstractLinkedList;
import org.example.domain.linkedlist.LinkedList;

import java.util.Objects;

public class DoubleLinkedList<T> extends AbstractLinkedList<T> {

    private Node<T> node;

    @Override
    public void add(T value) {
        var newNode = new Node<>(value);
        incrementerSize();
        if (Objects.isNull(node)) {
            node = newNode;
            return;
        }

        var lastNode = getLastNode();

        newNode.setHead(lastNode);
        lastNode.setTail(newNode);
    }

    @Override
    public void removeHead() {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        if (Objects.nonNull(node)) {
            node = node.getTail();
            if (Objects.nonNull(node) &&
                    Objects.nonNull(node.getHead())) {
                node.clearHead();
            }
        }
        decrementerSize();
    }

    @Override
    public void removeTail() {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        if (Objects.isNull(node.getTail())) {
            node = null;
        } else {
            var penultimateNode = getPenultimateNode();
            penultimateNode.clearTail();
        }
        decrementerSize();
    }

    @Override
    public int indexOf(T value) {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        else {
            var index = 0;
            var auxNode = node;
            do {
                if (value.equals(auxNode.getValue())) {
                    return index;
                }
                auxNode = auxNode.getTail();
                index++;
            } while (Objects.nonNull(auxNode));
            throw new IllegalArgumentException("Valor nao encontrado");
        }
    }

    @Override
    public T get(int index) {
        if (isEmpty()) throw new IllegalStateException("Lista vazia !");
        else {
            var auxIndex = 0;
            var auxNode = node;
            while (Objects.nonNull(auxNode)) {
                if (auxIndex == index) {
                    return auxNode.getValue();
                }
                auxNode = auxNode.getTail();
                auxIndex++;
            }
            throw new IllegalArgumentException("Valor nao encontrado");
        }
    }

    private Node getLastNode() {
        var lastNode = node;

        while (Objects.nonNull(lastNode.getTail())) lastNode = lastNode.getTail();

        return lastNode;
    }

    private Node getPenultimateNode() {
        var lastNode = node;

        while (Objects.nonNull(lastNode.getTail().getTail())) lastNode = lastNode.getTail();

        return lastNode;
    }

}
