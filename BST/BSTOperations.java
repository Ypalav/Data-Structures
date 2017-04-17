package binarysearchtrees;

public class BSTOperations {

	BSTNode root;

	// searchRecursive
	public boolean searchRecursive(BSTNode node, int key) {
		if (node != null) {
			if (key == node.getData())
				return true;
			if (node.getData() > key)
				return searchRecursive(node.getLeft(), key);
			else if (node.getData() < key)
				return searchRecursive(node.getRight(), key);
		}
		return false;
	}

	// searchIterative
	public boolean searchIterative(BSTNode node, int key) {
		while (node != null) {
			if (key == node.getData())
				return true;
			else if (node.getData() > key)
				node = node.getLeft();
			else
				node = node.getRight();
		}
		return false;
	}

	// searchMinRecursive
	public BSTNode searchMinRecursive(BSTNode node) {
		if (node.getLeft() == null)
			return node;
		return searchMinRecursive(node.getLeft());
	}

	// searchMinIterative
	public BSTNode searchMinIterative(BSTNode node) {
		if (node == null)
			return null;
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node;
	}

	// searchMaxRecursive
	public BSTNode searchMaxRecursive(BSTNode node) {
		if (node.getRight() == null)
			return node;
		return searchMaxRecursive(node.getRight());
	}

	// searchMaxIterative
	public BSTNode searchMaxIterative(BSTNode node) {
		if (node == null)
			return null;
		while (node.getRight() != null) {
			node = node.getRight();
		}
		return node;
	}

	// insertRecursive
	public BSTNode insertRecursive(BSTNode node, int key) {
		if (node == null) {
			node = new BSTNode(key);
			return node;
		} else {
			if (node.getData() > key)
				node.setLeft(insertRecursive(node.getLeft(), key));
			else if (node.getData() < key)
				node.setRight(insertRecursive(node.getRight(), key));
		}
		return node;
	}

	// delete
	public BSTNode delete(BSTNode node, int key) {
		if (node == null)
			return null;
		if (node.getData() > key)
			node.setLeft(delete(node.getLeft(), key));
		else if (node.getData() < key)
			node.setRight(delete(node.getRight(), key));
		else {
			if (node.getLeft() != null && node.getRight() != null) {
				BSTNode temp = searchMaxRecursive(node.getLeft());
				node.setData(temp.getData());
				node.setLeft(delete(node.getLeft(), node.getData()));
			} else {
				BSTNode temp = node;
				if (temp.getLeft() == null)
					node = node.getRight();
				else if (temp.getRight() == null)
					node = node.getLeft();
				temp = null;
			}
		}
		return node;
	}

	// floor & ceil
	public void findPredSucc(BSTNode node, BSTNode pre, BSTNode suc, int key) {
		if (node == null)
			return;
		if (node.getData() == key) {
			if (node.getLeft() != null) {
				BSTNode temp = node.getLeft();
				while (temp.getRight() != null)
					temp = temp.getRight();
				pre = temp;
			}
			if (node.getRight() != null) {
				BSTNode temp = node.getRight();
				while (temp.getLeft() != null)
					temp = temp.getLeft();
				suc = temp;

			}
			System.out.println(pre.getData());
			System.out.println(suc.getData());
			return;
		} else if (node.getData() < key) {
			pre = node;
			findPredSucc(node.getRight(), pre, suc, key);
		} else if (node.getData() > key) {
			suc = node;
			findPredSucc(node.getLeft(), pre, suc, key);
		}
	}

}
