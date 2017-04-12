public class Heap {
	public int[] array;
	public int count;
	public int capacity;
	public int heap_type;

	public Heap(int capacity, int heap_type) {
		this.heap_type = heap_type;
		count = 0;
		this.capacity = capacity;
		array = new int[capacity];
	}

	public int parent(int i) {
		if (i <= 0 || i > this.count) {
			return -1;
		}
		return (i - 1) / 2;
	}

	public int leftChild(int i) {
		int left = i * 2 + 1;
		if (left >= this.count)
			return -1;
		return left;
	}

	public int rightChild(int i) {
		int right = i * 2 + 2;
		if (right >= this.count)
			return -1;
		return right;
	}

	public int getMax(int i) {
		if (this.count == 0)
			return -1;
		return this.array[i];
	}

	// Heapifying - O(logn)
	public void percolateDown(int i) {
		int l, r, max;
		l = leftChild(i);
		r = rightChild(i);

		if (l != -1 && this.array[l] > this.array[i])
			max = l;
		else
			max = i;

		if (r != -1 && this.array[r] > this.array[max])
			max = r;

		if (max != i) {
			int temp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max] = temp;
		}
		percolateDown(max);
	}

	// Deleting Max O(logn)
	public int deleteMax() {
		if (this.count == 0)
			return -1;
		int data = this.array[0];
		this.array[0] = this.array[this.count - 1];
		this.count--;
		percolateDown(0);
		return data;
	}

	// Inserting
	public void insert(int data) {
		if (this.count == this.capacity)
			resizeHeap();
		this.count++;
		int i = this.count - 1;
		while (i >= 0 && data > this.array[(i - 1) / 2]) {
			this.array[i] = this.array[(i - 1) / 2];
			i = (i - 1) / 2;
		}
		this.array[i] = data;
	}

	// Resize heap
	private void resizeHeap() {
		// TODO Auto-generated method stub

	}

	// BuildHeap O(n)
	public void buildHeap(int A[]) {
		while (this.count == capacity)
			resizeHeap();

		for (int i = 0; i < A.length; i++){
			this.array[i] = A[i];
			this.count++;
		}

		for (int i = ((A.length) - 1) / 2; i >= 0; i--)
			percolateDown(i);
	}

	// Destroy Heap
	public void destroyHeap() {
		this.count = 0;
		this.array = null;
	}

	// HeapSort
	public void heapSort(int A[]) {
		buildHeap(A);
		int old_size = this.count;
		for (int i = A.length - 1; i >= 0; i--) {
			int temp = this.array[0];
			this.array[0] = this.array[this.count - 1];
			this.count--;
			percolateDown(0);
		}
		this.count = old_size;
	}

	public static void main(String args[]) {
		Heap heap = new Heap(20, 0);

		int[] inpArr = { 17, 13, 6, 1, 4, 2, 5 };
		/*for(int c:inpArr){
			heap.insert(c);
		}*/
		heap.buildHeap(inpArr);

		System.out.println(heap.parent(2));
	}

}
