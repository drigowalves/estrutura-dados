package org.example.domain.linkedlist.doublelinkedlist;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.AbstractNode;

@Getter
@Setter
class Node<T> extends AbstractNode<T> {

    private Node<T> head;
    private Node<T> tail;

    public Node(T value) {super(value);}

    public void clearHead() {
        this.head = null;
    }

    public void clearTail() {
        this.tail = null;
    }

}
