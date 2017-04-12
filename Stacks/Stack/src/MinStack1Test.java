package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinStack1Test {

	@Test
	public void test() throws Exception {
		MinStack1 min = new MinStack1();
		min.push(5);
		System.out.println(min.min());
		min.push(6);
		System.out.println(min.min());
		min.push(3);
		System.out.println(min.min());
		min.push(7);
		System.out.println(min.min());
		System.out.println("pops " + min.pop());
		System.out.println(min.min());
		System.out.println("pops " + min.pop());
		System.out.println(min.min());
	}

}
