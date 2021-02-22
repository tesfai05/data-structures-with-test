package com.tesfai.stack.linkedlist;

import java.util.EmptyStackException;

public class StackLinkedList<E> {
	// the first node
	private Node head; 
	 
	// nest class to define linked list node
	private class Node {
		E value;
		Node next;
	}
 
	public StackLinkedList() {
		head = null;
	}

	public void push(E e) {
		Node oldHead = head;
		head = new Node();
		head.value = e;
		head.next = oldHead;
	}

	public E pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			throw new EmptyStackException();
		}

		E e = head.value;
		head = head.next;
		return e;
	}
	
	public E peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			throw new EmptyStackException();
		}
		E e=head.value;
		return e;
	}
	
	
	public boolean contains(E e) {
		if (isEmpty()) {
			return false;
		}
		
		Node cNode=head;
		while(cNode!=null) {
			if(cNode.value==e||cNode.value.equals(e))
				return true;
			cNode=cNode.next;
		}
		return false;
	}

	public boolean isEmpty() {
		return  (head ==null);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		Node n=head;
		while (n!=null) {
			sb.append(n.value.toString());
			if (n.next!=null) {
				sb.append(",");
			}
			n=n.next;
		}
		sb.append(']');
		return sb.toString();
	}
}
