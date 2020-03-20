package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;


    class Node {
        String word;
        Node next;

        public Node(String d){
            word = d;
            next = null;
        }

    }
    public void add(String word){
        Node node = new Node(word);
        node.word = "";
        if (head == null){
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }

    }
    public Node getNode(Integer index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public void addNode(String data){
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

    public void removeAtIndex(Integer index){

    }

    public Boolean contains(Integer data){
        return null;
    }

    public Integer find(Integer index){
        return null;
    }

    public Integer size(){
        return null;
    }

    public static SinglyLinkedList copy(SinglyLinkedList list){
        return null;
    }

    public void sort(){

    }
}
