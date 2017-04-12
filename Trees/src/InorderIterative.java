import java.util.Stack;

public class InorderIterative {
	Node root;

	public void iterativeInOrder(Node node) {
		if (node == null)
			return;
		Stack<Node> newStack = new Stack<Node>();
		while (node != null) {
			newStack.push(node);
			node = node.left;
		}

		while (newStack.size() > 0) {
			node = newStack.pop();
			System.out.println(node.key + " ");
			if(node.right!=null){
				node=node.right;
				
				while(node!=null){
					newStack.push(node);
					node=node.left;
				}
			}
		}
	}

	public static void main(String args[]) {
		InorderIterative inorderIterative=new InorderIterative();
		inorderIterative.root=new Node(1);
		inorderIterative.root.left=new Node(2);
		inorderIterative.root.right=new Node(3);
		inorderIterative.root.left.left=new Node(4);
		inorderIterative.root.left.right=new Node(5);
		
		inorderIterative.iterativeInOrder(inorderIterative.root);
	}

}
