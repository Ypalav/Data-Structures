public class CircularArray {
	private int head;
	private int tail;
	private int[] arr;

	public CircularArray() {
		arr = new int[1];
		head = tail = 0;
	}

	public void resize(int capacity) {
		int[] copy = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		arr = copy;
	}

	public void enqueue(int data) {
		if (tail == arr.length && arr[0] != -1)
			resize(arr.length * 2);
		else if (tail == arr.length && arr[0] == -1)
			tail = 0;
		arr[tail++] = data;
	}

	public int dequeue() {
		int returnVal = arr[head];
		arr[head] = -1;
		head++;
		if (head == arr.length)
			head = 0;
		if (tail - head == arr.length / 4)
			resize(arr.length / 2);
		return returnVal;

	}
}
