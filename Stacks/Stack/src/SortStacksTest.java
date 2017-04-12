package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortStacksTest {

	@Test
	public void test() {
		SortStacks stack = new SortStacks();
		stack.push(10);
		stack.push(2);
		stack.push(31);
		stack.push(14);
		stack.push(5);
		stack.push(16);
		stack.pop();
		stack.printSortedStack();
	}

}
