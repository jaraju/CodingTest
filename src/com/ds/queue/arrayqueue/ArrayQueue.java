package com.ds.queue.arrayqueue;

class MyQueue {

	private Integer[] queue;
	private int front;
	private int back;

	public MyQueue() {
		queue= (Integer[]) new Object[100];
	}

	public void enqueue(Integer integer) {
		if (back == queue.length) {
			Integer[] newArray = (Integer[]) new Object[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;
		}

		queue[back] = integer;
		back++;
	}

	public void dequeue() {
		if (size() != 0) {
			queue[front] = null;
			front++;
		} else {
			front = 0;
			back = 0;
		}

	}
	
	public Integer peek() {
		return queue[front];
	}

	public int size() {
		return back - front;
	}

}
