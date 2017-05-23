package com.conceptoftheday.popular60;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		pQueue.offer(21);
		pQueue.offer(17);
		pQueue.offer(37);
		pQueue.offer(41);
		pQueue.offer(9);
		pQueue.offer(67);
		pQueue.offer(31);
		System.out.println(pQueue);
		System.out.println(pQueue.poll());
		System.out.println(pQueue);
	}

}
