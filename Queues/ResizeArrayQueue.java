package stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizeArrayQueue<Item> implements Iterable<Item> {

	private Item item[];
	private int n;
	private int first;
	private int last;

	public ResizeArrayQueue() {
		first = last = n = 0;
		item = (Item[]) new Object[2];
	}

	public void enqueue(Item item) {
		if (n == this.item.length)
			resize(this.item.length * 2);
		this.item[last++] = item;
		if (last == this.item.length)
			last = 0;
		n++;
	}

	public int size() {
		return n;
	}

	public Item dequeue() {
		if (isEmpty())
			throw new NoSuchElementException("Queue Underflow");
		Item item = this.item[first];
		this.item[first] = null;
		n--;
		first++;
		if (n > 0 && n == this.item.length / 4)
			resize(this.item.length / 2);
		return item;
	}

	public Item peek() {
		if (isEmpty())
			throw new NoSuchElementException("Queue Underflow");
		return this.item[first];
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return n == 0;
	}

	private void resize(int i) {
		// TODO Auto-generated method stub
		Item tempItem[] = (Item[]) new Object[i];
		for (int j = 0; j < tempItem.length; j++) {
			tempItem[j] = this.item[(first + j) % this.item.length];
		}
		this.item = tempItem;
		first = 0;
		last = n;
	}

	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ResizeArrayIterator();
	}

	private class ResizeArrayIterator<Item> implements Iterator<Item> {
		int i = 0;

		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < n;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		public Item next() {
			if (!hasNext())
				throw new NoSuchElementException();
			Item tempItem = (Item) item[(i + first) % item.length];
			i++;
			return tempItem;
		}

	}

}
