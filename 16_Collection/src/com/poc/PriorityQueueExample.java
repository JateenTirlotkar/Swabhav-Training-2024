package com.poc;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("PriorityQueue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Polled element: " + pq.poll());
        }
    }
}
/*A special type of queue where elements are automatically ordered based on their priority.
When you add elements, they are placed in the queue based on their priority 
(natural order or a custom order you define). 
The smallest or highest priority element is always at the front.
Useful when you need to process elements based on priority rather than the order they were added*/

