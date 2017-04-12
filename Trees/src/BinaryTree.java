import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;

	public BinaryTree(int key) {
		root = new Node(key);
	}

	public BinaryTree() {
		root = null;
	}

	void inOrder(Node node) {
		if (node == null)
			return;

		inOrder(node.left);
		System.out.print(node.key);
		inOrder(node.right);
	}
	
	void preOrder(Node node) {
		if (node == null)
			return;
		
		System.out.print(node.key);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	void postOrder(Node node) {
		if (node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key);
	}
	
	void levelOrder(Node node){
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.println(tempNode.key+" ");
			if(tempNode.left!=null)
				queue.add(tempNode.left);
			
			if(tempNode.right!=null)
				queue.add(tempNode.right);
		}
	}

	public static void main(String args[]) {
		BinaryTree bTree = new BinaryTree();
		bTree.root = new Node(1);
		bTree.root.left = new Node(2);
		bTree.root.right = new Node(3);
		bTree.root.left.left = new Node(4);
		bTree.root.left.right = new Node(5);
		
		System.out.println("\nPreorder traversal of binary tree is ");
		bTree.preOrder(bTree.root);
		
		System.out.println("\nInorder traversal of binary tree is ");
		bTree.inOrder(bTree.root);
		
		System.out.println("\nPostorder traversal of binary tree is ");
		bTree.postOrder(bTree.root);
		
		System.out.println("Level order traversal of binary tree is - ");
		bTree.levelOrder(bTree.root);
	}
}
