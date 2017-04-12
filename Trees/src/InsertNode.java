public class InsertNode {
	Node root = null;

	public Node insertNode(Node node, int target) {

		if (node == null) {
			node = new Node(target);
			return node;
		}

		if (node.key > target)
			node.left = insertNode(node.left, target);
		else
			node.right = insertNode(node.right, target);
		return node;
	}

	public void insertN(int target) {
		root = insertNode(root, target);
	}

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.key + " ");
			inOrder(root.right);
		}
	}

	public static void main(String args[]) {
		InsertNode tree = new InsertNode();
		tree.insertN(50);
		tree.insertN(30);
		tree.insertN(20);
		tree.insertN(40);
		tree.insertN(70);
		tree.insertN(60);
		tree.insertN(80);
		tree.inOrder(tree.root);
	}

}
