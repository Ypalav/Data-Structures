public class FindAncestors {
	Node root;

	public boolean printAncestors(Node node, int targetNode) {
		if (node == null)
			return false;
		if (node.key == targetNode) {
			return true;
		}
		if (printAncestors(node.left, targetNode)
				|| (printAncestors(node.right, targetNode))) {
			System.out.println(node.key + " ");
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		FindAncestors tree=new FindAncestors();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
  
        tree.printAncestors(tree.root, 7);
		
	}
	
}
