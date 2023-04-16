package org.example.domain;

import lombok.Getter;

@Getter
public abstract class AbstractNode<T> {
    private final T value;

    public AbstractNode(T value) {
        this.value = value;
    }
}
