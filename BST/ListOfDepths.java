package binarysearchtrees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListOfDepths {
	BSTNode root;

	public void createListsWrapper(BSTNode node) {
		ArrayList<LinkedList<BSTNode>> lists = new ArrayList<LinkedList<BSTNode>>();
		createLists(node, lists, 0);
		for (int i = 0; i < lists.size(); i++) {
			LinkedList<BSTNode> list = lists.get(i);
			Iterator<BSTNode> iter = list.listIterator();
			while (iter.hasNext()) {
				BSTNode temp = iter.next();
				System.out.println(temp.getData());
			}
		}
	}

	private void createLists(BSTNode node,
			ArrayList<LinkedList<BSTNode>> lists, int level) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		LinkedList<BSTNode> list = null;
		if (lists.size() == level) {
			list = new LinkedList<BSTNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(node);
		createLists(node.getLeft(), lists, level + 1);
		createLists(node.getRight(), lists, level + 1);
	}
}
