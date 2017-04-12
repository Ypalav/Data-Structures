package stacks;

public class MinStack1 extends MinStack {
	MinStack min1;

	public MinStack1() {
		min1 = new MinStack();
	}

	public void push(int val) {
		try {
			if (val < min()) {
				min1.push(val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.push(val);
	}

	public int pop() {
		int val = 0;
		try {
			val = super.pop();
			if (val == min())
				min1.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public int peek() {
		int val = 0;
		try {
			val = super.peek();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}

	public int min() throws Exception {
		if (!min1.isEmpty())
			return min1.peek();
		else
			return Integer.MAX_VALUE;
	}
}
