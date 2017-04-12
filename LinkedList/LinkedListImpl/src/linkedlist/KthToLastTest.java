package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class KthToLastTest {

	@Test
	public void test() throws Exception {
		KthToLast last = new KthToLast();
		for (int i = 1; i <= 10; i++)
			last.insertAtEnd(i);
		System.out.println(last.recursiveSoln(2));
		System.out.println(last.findkThToLast(2));
	}
}
