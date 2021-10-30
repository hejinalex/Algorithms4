package com.alex.algorithms4.Part1;

import com.alex.algorithms4.Stopwatch;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class ThreeSum {


    // 1000 --- 0.22
    // 2000 --- 1.642
    // 3000 --- 5.063
    // 4000 --- 11.395
    public static void main(String[] args) {
        int N = 4000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000, 1000000);
        }
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        int cnt = count(a);
        double time = stopwatch.elapsesTime();
        StdOut.println(N + " " + cnt + " " + time);
    }

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                int index = BinarySearch.search(-(a[i] + a[j]), a);
                if (index >= 0 && index > i) {
                    cnt++;
                }

//                for (int k = j + 1; k < N; k++) {
//                    if (a[i] + a[j] + a[k] == 0) {cnt++;}
//                }
            }
        }
        return cnt;
    }

}
