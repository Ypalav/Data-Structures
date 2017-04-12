package stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

class ResizingArrayStack<Item> implements Iterable<Item> {

	private Item[] item;
	private int n;

	public ResizingArrayStack() {
		item = (Item[]) new Object[2];
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void push(Item item) {
		if (n == this.item.length)
			resize(2 * this.item.length);
		this.item[n++] = item;
	}

	public Item pop() {
		if (isEmpty())
			throw new NoSuchElementException("Stack underflow");
		Item item = this.item[n - 1];
		this.item[n - 1] = null;
		n--;
		if (n == this.item.length / 4)
			resize(this.item.length / 2);
		return item;
	}

	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException("Stack Underflow");
		return this.item[n - 1];
	}

	public void resize(int capacity) {
		Item[] itemCopy = (Item[]) new Object[capacity];
		for (int i = 0; i < this.item.length; i++) {
			itemCopy[i] = this.item[i];
		}
		this.item = itemCopy;
	}

	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> {

		private int i;

		public ReverseArrayIterator() {
			i = n - 1;
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub

			return i >= 0;
		}

		public Item next() {
			// TODO Auto-generated method stub
			if (!hasNext())
				throw new NoSuchElementException();
			return item[i--];
		}

	}

}
