package linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitionListTest {

	@Test
	public void test() {
		PartitionList list = new PartitionList();
		list.insertAtEnd(3);
		list.insertAtEnd(5);
		list.insertAtEnd(8);
		list.insertAtEnd(5);
		list.insertAtEnd(10);
		list.insertAtEnd(2);
		list.insertAtEnd(1);

		list.partitionList(5);
	}

}
