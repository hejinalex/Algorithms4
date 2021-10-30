package com.alex.algorithms4.Part1;

class SimpleLinked<Item> {

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N;

    public boolean isEmpty() {
//        return first == null;
        return size() == 0;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        if (isEmpty()) {
            first = new Node();
            first.item = item;
        } else {
            Node current;
            for (current = first; current.next != null; current = current.next) ;
            Node last = new Node();
            last.item = item;
            current.next = last;
        }
        N++;
    }

    public void deleteLastNode() {
        if (!isEmpty()) {
            if (N == 1) {
                first = null;
            } else {
                Node current;
                for (current = first; current.next.next != null; current = current.next) ;
                current.next = null;
            }
            N--;
        }
    }

}
