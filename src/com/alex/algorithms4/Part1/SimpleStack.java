package com.alex.algorithms4.Part1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class SimpleStack<Item> implements Iterable {

    public Item[] a;
    private int N = 0;

    public SimpleStack(int size) {
        a = (Item[]) new Object[size];
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int arrayLength() {
        return a.length;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(N * 2);
        }
        a[N++] = item;
    }

    public Item pop() {
        if (N == a.length / 4) {
            resize(a.length / 2);
        }

        Item item = a[--N];
        a[N] = null;
        return item;
    }

    private void resize(int size) {
        Item[] temp = (Item[]) new Object[size];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void printAll() {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new SimpleStackIterator();
    }

    private class SimpleStackIterator<Item> implements Iterator {

        private int low = N;

        @Override
        public boolean hasNext() {
            return low > 0;
        }

        @Override
        public Item next() {
            Item item = (Item) a[--low];
            return item;
        }
    }

}
