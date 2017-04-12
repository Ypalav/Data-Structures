public class InorderPreSucc {
	Node root;
	Node successor = null, predecessor = null;

	public void checPreSuccessor(Node root, int key) {
		int flag=0;
		if (root == null)
			return;
		if (root.key == key) {
			flag=1;
			if (root.left != null) {
				Node temp = root.left;
				while (temp.right != null)
					temp = temp.right;
				predecessor = temp;
			}

			if (root.right != null) {
				Node temp = root.right;
				while (temp.left != null)
					temp = temp.left;
				successor = temp;
			}
		}

		if (key < root.key && flag==0) {
			successor = root;
			checPreSuccessor(root.left, key);
		} else if (key > root.key && flag==0) {
			predecessor = root;
			checPreSuccessor(root.right, key);
		}
	}

	public void insertN(int target) {
		root = insertNode(root, target);
	}

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

	public static void main(String args[]) {
		InorderPreSucc tree = new InorderPreSucc();
		tree.insertN(50);
		tree.insertN(30);
		tree.insertN(20);
		tree.insertN(40);
		tree.insertN(70);
		tree.insertN(60);
		tree.insertN(80);

		tree.checPreSuccessor(tree.root, 50);

		if (tree.predecessor != null)
			System.out.println(tree.predecessor.key);

		if (tree.successor != null)
			System.out.println(tree.successor.key);
	}

}
