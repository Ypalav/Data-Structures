package stacks;

//three stacks in one array
public class ThreeInOne {
	private final int stackSize = 100;
	private final int numOfStacks = 3;
	private int[] arrayForStacks;
	private int[] sizeArr = { -1, -1, -1 };

	public ThreeInOne() {
		arrayForStacks = new int[numOfStacks * stackSize];
	}

	public boolean isEmpty(int stackNum) {
		return sizeArr[stackNum] == -1;
	}

	public int size(int stackNum) {
		return sizeArr[stackNum];
	}

	public void push(int stackNum, int value) throws Exception {
		if (sizeArr[stackNum] >= stackSize)
			throw new Exception("Stack is Full");
		sizeArr[stackNum]++;
		arrayForStacks[sizeArr[stackNum] + (stackSize * stackNum)] = value;

	}

	public int pop(int stackNum) throws Exception {
		if (isEmpty(stackNum))
			throw new Exception("Stack is empty");
		sizeArr[stackNum]--;
		int val = arrayForStacks[sizeArr[stackNum] + (stackSize * stackNum)];

		return val;
	}

	public int peek(int stackNum) throws Exception {
		if (isEmpty(stackNum))
			throw new Exception("Stack is empty");
		return arrayForStacks[sizeArr[stackNum] + (stackSize * stackNum)];
	}

	public void printArr() {
		for (int i = 0; i < numOfStacks; i++) {
			for (int j = (stackSize * i); j <= ((stackSize * i) + sizeArr[i]); j++) {
				System.out.print(arrayForStacks[j]+ " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
