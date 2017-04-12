public class LCA {
	Node root;

	public Node findLCA(Node node, int n1, int n2) {
		int flag = 0;
		while (node != null) {
			if (node.key > n1 && node.key > n2) {
				flag = 0;
				node = node.left;
			} else if (node.key < n1 && node.key < n2) {
				flag = 0;
				node = node.right;
			} else {
				break;
			}
		}
		return node;
	}

	public static void main(String args[]) {
		LCA tree = new LCA();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);

		int n1 = 10, n2 = 14;
		Node t = tree.findLCA(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

		n1 = 36;
		n2 = 8;
		t = tree.findLCA(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

		n1 = 10;
		n2 = 22;
		t = tree.findLCA(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
	}
}
