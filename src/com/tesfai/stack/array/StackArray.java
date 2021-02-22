package com.tesfai.stack.array;

import java.util.Arrays;

public class StackArray<E> {
	private int top = -1;
	private static final int DEFAULT_CAPACITY = 2;
	private Object[] elements;

	public StackArray() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(E e) {
		if (isFull()) {
			resize();
		}
		top++;
		elements[top] = e;

	}

	private boolean isFull() {
		return (top == elements.length - 1);
	}

	private void resize() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public E pop() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		E e = (E) elements[top];
		elements[top] = null;
		top--;
		return e;
	}

	public E peek() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		E e = (E) elements[top];
		return e;
	}

	public boolean contains(E e) {
		if (isEmpty()) {
			return false;
		}
		for (Object element : elements) {
			if (element.equals(e)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < top; i++) {
			sb.append(elements[i].toString());
			sb.append(",");
		}
		sb.append(elements[top].toString());
		sb.append("]");
		return sb.toString();
	}
}
