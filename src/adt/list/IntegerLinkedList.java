package adt.list;

public class IntegerLinkedList {
	
	private int size;
	private Node head;
	private Node tail;
	
	
	public IntegerLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}
	
	
	public boolean add(int item) {
		Node node = new Node(item);
		
		if(tail != null) {
			tail.setNext(node);
		}
		
		if (head == null) {
			head = node;
		}

		tail = node;
		size++;
		
		return true;
	}

	
	public int get(int index) throws IndexOutOfBoundsException {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index " + index + " out of range (" + size + ")");
		}
		
		Node node = head;
		
		for(int i = 0; i < index; i++) {
			node = node.next();
		}
		
		return node.getValue();
	}
	
	
	public boolean remove(int item) {
		if (head == null) return false;

		boolean removed = false;
		
		// prehead
		Node node = new Node(0);
		node.setNext(head);
		
		while(node.next() != null) {
			// Check if node needs to be removed
			if (node.next().getValue() == item) {
				removed = true;
				// check if the node being removed is the head
				if (node.next() == head) {
					head = node.next().next();
				}
				node.setNext(node.next().next());
				size--;
			}
			// if no node was removed, advance the node
			else node = node.next();
		}
		
		return removed;
	} 
	
	
	public int size() {
		return size;
	}
	
	
	
	public String toString() {
		String s = "[";
		
		Node node = head;
		
		while(node != null) {
			s += node.getValue();
			
			if (node.next() != null) {
				s += ", ";
			}
			
			node = node.next();
		}
		
		return s + "]";
	}
	
	
	private class Node {
		private int value;
		private Node link;
		
		Node(int newValue) {
			value = newValue;
			link = null;
		}
		
		int getValue() {
			return value;
		}
		
		void setNext(Node nextNode) {
			link = nextNode;
		}
		
		Node next() {
			return link;
		}
	}
	
}
