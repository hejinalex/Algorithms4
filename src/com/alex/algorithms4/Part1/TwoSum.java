package com.alex.algorithms4.Part1;

import com.alex.algorithms4.Stopwatch;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

class TwoSum {

    // 1.301
    public static void main(String[] args) {
        int N = 10000000;
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
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {

            int index = BinarySearch.search(-a[i], a);
            if (index >= 0 && index > i) {
                cnt++;
            }

//            for (int j = i + 1; j < N; j++) {
//                if (a[i] + a[j] == 0) {
//                    cnt++;
//                }
//            }
        }
        return cnt;

//        int N = a.length;
//        int cnt = 0;
//        HashMap<Integer, Integer> map = new HashMap<>(N);
//        for (int i = 0; i < N; i++) {
//            map.put(a[i], i);
//        }
//        for (int j : a) {
//            int temple = -j;
//            if (map.containsKey(temple)) {
//                cnt++;
//            }
//        }
//        return cnt;
    }

}
