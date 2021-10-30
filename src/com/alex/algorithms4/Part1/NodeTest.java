package com.alex.algorithms4.Part1;

class NodeTest {

   private static class Node {
      int value;
      Node next;
   }

   public static void main(String[] args) {
      Node first = new Node();
      first.value = 1;
      Node second = new Node();
      second.value = 2;
      Node last = new Node();
      last.value = 3;
      first.next = second;
      second.next = last;


//      first = first.next;

//      Node oldFirst = first;
//      first = new Node();
//      first.value = 0;
//      first.next = oldFirst;

      Node oldLast = last;
      last = new Node();
      last.value = 4;
      oldLast.next = last;




   }

}
