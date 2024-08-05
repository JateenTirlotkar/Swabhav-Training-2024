package com.poc;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("Second");

        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from end: " + deque.removeLast());
    }
}
/*  A queue where you can add or remove elements from both the front and the back.
 *  You can use methods like addFirst(), addLast(), removeFirst(), 
 *  and removeLast() to manipulate elements at both ends.
 *  Useful when you need to add or remove elements from both ends of the queue, like in a double-ended stack
 * */

