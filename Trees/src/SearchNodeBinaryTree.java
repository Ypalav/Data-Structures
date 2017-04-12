public class SearchNodeBinaryTree {
	Node root;

	public Node searchInATree(Node node, int target) {
		if (node == null)
			return null;
		if (node.key == target)
			return node;

		if (node.key > target)
			return searchInATree(node.left, target);
		else
			return searchInATree(node.right, target);
	}

	public static void main(String args[]) {
		SearchNodeBinaryTree tree = new SearchNodeBinaryTree();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);
		tree.root.right = new Node(10);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);

		Node outputNode = tree.searchInATree(tree.root, 1);
		if (outputNode == null)
			System.out.println("Node not found");
		else
			System.out.println(outputNode.key);
	}

}
