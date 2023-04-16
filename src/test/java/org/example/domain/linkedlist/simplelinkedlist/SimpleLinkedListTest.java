package org.example.domain.linkedlist.simplelinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleLinkedListTest {

    @Test
    public void testAddOneValue() {
        var simpleLinkedList = getIntegerSimpleLinkedListWithOneValue();
        Assertions.assertEquals(1, simpleLinkedList.size());
    }

    @Test
    public void testAddTwoValue() {
        var simpleLinkedList = getIntegerSimpleLinkedListWithTwoValues();
        Assertions.assertEquals(2, simpleLinkedList.size());
    }

    @Test
    public void testAddThreeValue() {
        var simpleLinkedList = getIntegerSimpleLinkedListWithThreeValues();
        Assertions.assertEquals(3, simpleLinkedList.size());
    }

    @Test
    public void testRemoveHead_whenListIsEmpty() {
        var simplesLinkedList = new SimpleLinkedList<Integer>();
        Assertions.assertThrows(IllegalStateException.class, () -> simplesLinkedList.removeHead());
    }

    @Test
    public void testRemoveHead_whenListHasOneValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithOneValue();
        simplesLinkedList.removeHead();
        Assertions.assertEquals(0, simplesLinkedList.size());
    }

    @Test
    public void testRemoveHead_whenListHasTwoValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithTwoValues();
        simplesLinkedList.removeHead();
        Assertions.assertEquals(1, simplesLinkedList.size());
    }

    @Test
    public void testRemoveHead_whenListHasThreeValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithThreeValues();
        simplesLinkedList.removeHead();
        Assertions.assertEquals(2, simplesLinkedList.size());
    }

    @Test
    public void testRemoveTail_whenListIsEmpty() {
        var simplesLinkedList = new SimpleLinkedList<Integer>();
        Assertions.assertThrows(IllegalStateException.class, () -> simplesLinkedList.removeTail());
    }

    @Test
    public void testRemoveTail_whenListHasOneValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithOneValue();
        simplesLinkedList.removeTail();
        Assertions.assertEquals(0, simplesLinkedList.size());
    }

    @Test
    public void testRemoveTail_whenListHasTwoValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithTwoValues();
        simplesLinkedList.removeTail();
        Assertions.assertEquals(1, simplesLinkedList.size());
    }

    @Test
    public void testRemoveTail_whenListHasThreeValue() {
        var simplesLinkedList = getIntegerSimpleLinkedListWithThreeValues();
        simplesLinkedList.removeTail();
        Assertions.assertEquals(2, simplesLinkedList.size());
    }

    private SimpleLinkedList<Integer> getIntegerSimpleLinkedListWithOneValue() {
        var simpleLinkedList = new SimpleLinkedList<Integer>();
        simpleLinkedList.add(1);
        return simpleLinkedList;
    }

    private SimpleLinkedList<Integer> getIntegerSimpleLinkedListWithTwoValues() {
        var simpleLinkedList = getIntegerSimpleLinkedListWithOneValue();
        simpleLinkedList.add(2);
        return simpleLinkedList;
    }

    private SimpleLinkedList<Integer> getIntegerSimpleLinkedListWithThreeValues() {
        var simpleLinkedList = getIntegerSimpleLinkedListWithTwoValues();
        simpleLinkedList.add(3);
        return simpleLinkedList;
    }

}