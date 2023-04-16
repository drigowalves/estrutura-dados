package org.example.domain.linkedlist.doublelinkedlist.impl;

import org.example.domain.linkedlist.doublelinkedlist.DoubleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListTest {

    @Test
    public void testAddOneValue() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithOneValue();
        Assertions.assertEquals(1, doubleLikedList.size());
    }

    @Test
    public void testAddTwoValues() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithTwoValues();
        Assertions.assertEquals(2, doubleLikedList.size());
    }

    @Test
    public void testAddThreeValues() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithThreeValues();
        Assertions.assertEquals(3, doubleLikedList.size());
    }

    @Test
    public void testRemoveHead_whenListHasOneValue() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithOneValue();
        doubleLikedList.removeHead();
        Assertions.assertEquals(0, doubleLikedList.size());
    }

    @Test
    public void testRemoveHead_whenListHasTwoValues() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithTwoValues();
        doubleLikedList.removeHead();
        Assertions.assertEquals(1, doubleLikedList.size());
    }

    @Test
    public void testRemoveHead_whenListHasThreeValues() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithThreeValues();
        doubleLikedList.removeHead();
        Assertions.assertEquals(2, doubleLikedList.size());
    }

    @Test
    public void testRemoveHead_whenListIsEmpty() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListEmpty();
        Assertions.assertThrows(IllegalStateException.class, () -> doubleLikedList.removeHead());
    }

    @Test
    public void testRemoveTail_whenListHasOneValue() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithOneValue();
        doubleLikedList.removeTail();
        Assertions.assertEquals(0, doubleLikedList.size());
    }

    @Test
    public void testRemoveTail_whenListHasTwoValues() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListWithTwoValues();
        doubleLinkedList.removeTail();
        Assertions.assertEquals(1, doubleLinkedList.size());
    }

    @Test
    public void testRemoveTail_whenListHasThreeValues() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListWithThreeValues();
        doubleLinkedList.removeTail();
        Assertions.assertEquals(2, doubleLinkedList.size());
    }

    @Test
    public void testRemoveTail_whenListHasFourValues() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithFourValues();
        doubleLikedList.removeTail();
        Assertions.assertEquals(3, doubleLikedList.size());
    }

    @Test
    public void testRemoveTail_whenListIsEmpty() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListEmpty();
        Assertions.assertThrows(IllegalStateException.class, () -> doubleLikedList.removeTail());
    }

    @Test
    public void testIndexOf() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithFourValues();
        Assertions.assertEquals(0, doubleLikedList.indexOf(1));
        Assertions.assertEquals(1, doubleLikedList.indexOf(2));
        Assertions.assertEquals(2, doubleLikedList.indexOf(3));
        Assertions.assertEquals(3, doubleLikedList.indexOf(4));
    }

    @Test
    public void testIndexOf_whenValueNotFound() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithFourValues();
        Assertions.assertThrows(IllegalArgumentException.class, () -> doubleLikedList.indexOf(5));
    }

    @Test
    public void testIndexOf_whenListIsEmpty() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListEmpty();
        Assertions.assertThrows(IllegalStateException.class, () -> doubleLikedList.indexOf(5));
    }

    @Test
    public void testGet() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithFourValues();
        Assertions.assertEquals(1, doubleLikedList.get(0));
        Assertions.assertEquals(2, doubleLikedList.get(1));
        Assertions.assertEquals(3, doubleLikedList.get(2));
        Assertions.assertEquals(4, doubleLikedList.get(3));
    }

    @Test
    public void testGet_whenValueNotFound() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListWithFourValues();
        Assertions.assertThrows(IllegalArgumentException.class, () -> doubleLikedList.get(5));
    }

    @Test
    public void testGet_whenListIsEmpty() {
        DoubleLinkedList<Integer> doubleLikedList = getIntegerDoubleLinkedListEmpty();
        Assertions.assertThrows(IllegalStateException.class, () -> doubleLikedList.get(5));
    }

    private static DoubleLinkedList<Integer> getIntegerDoubleLinkedListEmpty() {
        var doubleLinkedList = new DoubleLinkedList<Integer>();
        return doubleLinkedList;
    }

    private DoubleLinkedList<Integer> getIntegerDoubleLinkedListWithOneValue() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListEmpty();
        doubleLinkedList.add(1);
        return doubleLinkedList;
    }

    private DoubleLinkedList<Integer> getIntegerDoubleLinkedListWithTwoValues() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListWithOneValue();
        doubleLinkedList.add(2);
        return doubleLinkedList;
    }

    private DoubleLinkedList<Integer> getIntegerDoubleLinkedListWithThreeValues() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListWithTwoValues();
        doubleLinkedList.add(3);
        return doubleLinkedList;
    }

    private DoubleLinkedList<Integer> getIntegerDoubleLinkedListWithFourValues() {
        DoubleLinkedList<Integer> doubleLinkedList = getIntegerDoubleLinkedListWithThreeValues();
        doubleLinkedList.add(4);
        return doubleLinkedList;
    }

}