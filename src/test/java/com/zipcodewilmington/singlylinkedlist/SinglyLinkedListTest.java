package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList sl = new SinglyLinkedList();

    @Before
    public void init(){
        sl.add("I");
        sl.add("am");
        sl.add("Iron Man");
    }

    @Test
    public void findTest(){
        int expected = 2;
        int actual = sl.find("Iron Man");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copyTest(){
        SinglyLinkedList sl2 = SinglyLinkedList.copy(sl);
        Assert.assertFalse(sl2==sl);
    }

    @Test
    public void getNodeTest(){
        String expected = "Iron Man";
        String  actual = sl.getNode(2).word;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAtTest(){

    }

    @Test
    public void containsTest(){
        Assert.assertTrue( sl.contains("I"));
    }

    @Test
    public void sizeTest(){
        int expected = 3;
        int actual = sl.size();
        Assert.assertEquals(expected,actual);
    }
}