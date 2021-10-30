package com.alex.algorithms4.Part2;

import com.alex.algorithms4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;

class Test {

   private static Stopwatch stopwatch = new Stopwatch();

   public static void main(String[] args) {
      int N = 10;
      Integer[] a = new Integer[N];
      for (int i = 0; i < N; i++) {
         a[i] = StdRandom.uniform(0, 100);
      }
      stopwatch.start();
      SelectionSort.sort(a);
      stopwatch.elapsesTime();
   }

}
