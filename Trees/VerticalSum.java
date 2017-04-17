package trees;

import java.util.HashMap;

public class VerticalSum {
	BinaryTreeNode root;

	public void findVSum(BinaryTreeNode node) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		vSum(node, map, 0);
	}

	private void vSum(BinaryTreeNode node, HashMap<Integer, Integer> map, int c) {
		// TODO Auto-generated method stub
		if (node.getLeft() != null)
			vSum(node.getLeft(), map, c - 1);
		if (node.getRight() != null)
			vSum(node.getRight(), map, c + 1);
		int data = 0;
		if (map.containsKey(c))
			data = map.get(c);
		map.put(c, node.getData() + data);
	}
}
