package com.h2kinfosys.learn.day10;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		// FIFO - Queue
		// FIFO + LIFO --> Deque
		PriorityQueue<String> queue = new PriorityQueue<String>();
		PriorityQueue<String> empty = new PriorityQueue<String>();
		// Collection: Inserts the specified element into this queue
		queue.add("A");
		queue.add("B");
		queue.add("C");
		System.out.println(queue);
		
		// Queue Specific: Inserts the specified element into this queue
		System.out.println(queue.offer("A"));
		System.out.println(queue);
		
		// remove and poll - non empty queue
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
		// remove and poll - empty queue
		System.out.println(empty.poll());
		// System.out.println(empty.remove());
		System.out.println("****element and peek ****");
		// element and peek - non empty queue
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		// element and peek - empty queue
		System.out.println(empty.peek());
		//System.out.println(empty.element());
		

		
	}

}
