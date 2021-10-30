package com.alex.algorithms4.Part1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

class BinarySearch {

    public static void main(String[] args) {

    }

    public static int search(int k, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < k) lo = mid + 1;
            else if (a[mid] > k) hi = mid - 1;
            else return mid;
        }
        return -1;
    }

}
