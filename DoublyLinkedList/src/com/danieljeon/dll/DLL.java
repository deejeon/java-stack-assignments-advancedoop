package com.danieljeon.dll;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	public Node pop() {
		Node lastNode = this.tail;
		lastNode.previous.next = null;
		this.tail = lastNode.previous;
		lastNode.previous = null;
		return lastNode;
	}
	
	public void printValuesForward() {
		Node current = this.head;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void printValuesBackward() {
		Node current = this.tail;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	
	public boolean contains(Integer value) {
		Node current = this.head;
		while (current != null) {
			if (current.value == value) return true;
			current = current.next;
		}
		return false;
	}
	
	public int size() {
		if (this.head == null) return 0;
		Node start = this.head;
		Node end = this.tail;
		Integer count = 0;
		while(start.previous != end && start != end) {
			count += 2;
			start = start.next;
			end = end.previous;
		}
		if (start == end) count++;
		return count;
	}
	
	public void insertAt(Node newNode, int index) {
		if (index > this.size()) {
			System.out.println("Invalid index");
		}
		else if (index == 0) {
			newNode.next = this.head;
			this.head.previous = newNode;
			this.head = newNode;
		}
		else if (index == this.size()) {
			newNode.previous = this.tail;
			this.tail.next = newNode;
			this.tail = newNode;
		}
		else {
			Node current = this.head;
			int currentIndex = 0;
			while (currentIndex < index) {
				current = current.next;
				currentIndex++;
			}
			newNode.previous = current.previous;
			newNode.next = current;
			current.previous.next = newNode;
			current.previous = newNode;
		}
	}

	public void removeAt(int index) {
		if (index > this.size() - 1) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			this.head = this.head.next;
			this.head.previous.next = null;
			this.head.previous = null;
		}
		else if (index == this.size() - 1) {
			this.pop();
		}
		else {
			Node current = this.head;
			int currentIndex = 0;
			while (currentIndex < index) {
				current = current.next;
				currentIndex++;
			}
			current.previous.next = current.next;
			current.next.previous = current.previous;
			current.next = null;
			current.previous = null;
		}
	}

}
