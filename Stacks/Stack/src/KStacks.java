public class KStacks {
	int[] arr;
	int[] top;
	int[] next;

	int n, k;
	int free;

	boolean isFull() {
		return free == -1;
	}

	boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}

	public KStacks(int k1, int n1) {
		k = k1;
		n = n1;
		arr = new int[n];
		next = new int[n];
		top = new int[k];
		free = 0;
		for (int i = 0; i < k; i++)
			top[i] = -1;

		for (int i = 0; i < n - 1; i++)
			next[i] = i + 1;

		next[n - 1] = -1;
	}

	public void push(int item, int stackNumber) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}

		int i = free;
		free = next[i];
		next[i] = top[stackNumber];
		top[stackNumber] = i;
		arr[i] = item;
	}

	public int pop(int stackNumber) {
		if (isEmpty(stackNumber)) {
			System.out.println("Stack Underflow");
			return Integer.MAX_VALUE;
		}
		int i = top[stackNumber];
		top[stackNumber] = next[i];
		next[i] = free;
		free = i;

		return arr[i];

	}

	public static void main(String args[]) {
		int k = 3, n = 10;
		KStacks kNew = new KStacks(k, n);
		kNew.push(15, 2);
		kNew.push(45, 2);

		kNew.push(17, 1);
		kNew.push(49, 1);
		kNew.push(39, 1);

		kNew.push(11, 0);
		kNew.push(9, 0);
		kNew.push(7, 0);

		System.out.println(kNew.pop(2));
		System.out.println(kNew.pop(1));
		System.out.println(kNew.pop(0));
	}

}
