package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList testList = new SinglyLinkedList();

    @Before
    public void setup(){
    }
    @Test
    public void addTest(){
        testList.addNode(13);
        testList.addNode(24);
        testList.addNode(35);

    }

}