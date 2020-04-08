package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;


    class Node {
        String word;
        Node next;

        public Node(String word){
            this.word = word;
            this.next = null;
        }

    }
    public void add(String word){
        Node node = new Node(word);

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
        Node current = head;
        Integer count = 0;
        if (current == null){
            return null;
        }
        else {
            while (!count.equals(index)){
                current = current.next;
                count++;
                if (current == null){
                    break;
                }
            }
            if (current != null){
                return current;
            }
        }
        return null;
    }


    public void removeAtIndex(Integer index){
        if (head == null)
            return;
        Node temp = head;
        if (index == 0)
        {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < index - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next;
        temp.next = next;
    }

    public Boolean contains(String data){
        return null;
    }

    public Integer find(String word){
        Node current = head;
        Integer index = 0;
        if (current == null){
            return -1;
        }
        else {
            while (!current.word.equals(word)){
                current = current.next;
                index++;
                if (current == null){
                    break;
                }
            }
            if (current != null && current.word.equals(word)){
                return index;
            }
        }
        return -1;
    }

    public Integer size(){
        int size = 1;
        Node temp = head;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public static SinglyLinkedList copy(SinglyLinkedList list){
        return null;
    }

    public void sort(){

    }
}
