package com.poc;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueueExample {
    public static void main(String[] args) {
        List<Integer> queue = new ArrayList<Integer>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("ArrayList as Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Polled element: " + queue.remove(0));
        }
    }
}
/* A simple queue implemented using an ArrayList.
 *  Elements are added to the end of the list, and removed from the front using the remove(0) method.
 *  Useful for basic queue operations when you don’t need the advanced features of a specialized queue class. */
