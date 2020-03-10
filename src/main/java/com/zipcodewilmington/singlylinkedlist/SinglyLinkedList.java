package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public Node getNode(Integer index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public void addNode(Integer data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        else {
            Node temp = head;
            if (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public void removeAtIndex(){

    }

    public Boolean contains(){
        return null;
    }

    public Integer find(){
        return null;
    }

    public Integer size(){
        return null;
    }

    public Node copy(){
        return null;
    }
}
