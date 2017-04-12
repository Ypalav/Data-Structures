package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeInOneTest {

	@Test(expected = Exception.class)
	public void test() throws Exception {
		ThreeInOne one = new ThreeInOne();
		// one.printArr();
		one.push(2, 50);
		one.push(1, 190);
		one.push(2, 20);
		one.push(1, 10);
		one.pop(0);
		one.printArr();
	}

}
