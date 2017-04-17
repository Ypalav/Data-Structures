package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintPathTest {

	@Test
	public void test() {
		PrintPath max = new PrintPath();
		max.root = new BinaryTreeNode(1, null, null);
		max.root.setLeft(new BinaryTreeNode(2, null, null));
		max.root.setRight(new BinaryTreeNode(3, null, null));
		max.root.getLeft().setLeft(new BinaryTreeNode(4, null, null));
		max.root.getLeft().setRight(new BinaryTreeNode(5, null, null));
		max.root.getLeft().getRight()
				.setLeft(new BinaryTreeNode(6, null, null));
		max.printPaths(max.root);
	} 

}
