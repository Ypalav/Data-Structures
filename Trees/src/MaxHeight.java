public class MaxHeight {
	Node root;

	public int calcHeight(Node node) {
		if (node == null)
			return 0;
		else {
			int lheight = calcHeight(node.left);
			int rheight = calcHeight(node.right);

			if (lheight > rheight)
				return lheight + 1;
			else
				return rheight + 1;
		}
	}

	public static void main(String args[]) {
		MaxHeight mHeight = new MaxHeight();
		mHeight.root = new Node(1);
		mHeight.root.left = new Node(2);
		mHeight.root.right = new Node(3);
		mHeight.root.left.left = new Node(4);
		mHeight.root.left.right = new Node(5);
		System.out.println(mHeight.calcHeight(mHeight.root));
	}

}
