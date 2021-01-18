package com.yit.exercise.linkedlist;

public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList("a");
        singlyLinkedList.add("b");
        singlyLinkedList.add("c");
        singlyLinkedList.add("d");

        singlyLinkedList.delete("a");
        singlyLinkedList.delete("d");
        System.out.println(singlyLinkedList.toString());
    }


    Node head;

    public SinglyLinkedList(Object object) {
        Node node = new Node();
        node.o = object;

        head = node;
    }

    public SinglyLinkedList() {
        Node node = new Node();
        head = node;
    }

    public void delete(Object object) {
        Node current = head;

        if (current.o.equals(object)) {
            head = current.next;
            return;
        }

    }

    public void add(Object object) {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        Node toAdd = new Node();
        toAdd.o = object;

        current.next = toAdd;
    }

    public String toString() {
        Node current = head;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(current.o.toString());
        while (current.next != null) {
            current = current.next;
            stringBuilder.append(current.o.toString());
        }

        return stringBuilder.toString();
    }
}

class Node {
    public Object o;
    public Node next;
}
