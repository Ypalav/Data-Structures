import java.util.Stack;


public class KthSmallestEleemt {
	Node root;
	public Node findKthElement(Node node, int kthElement){
		int temp=0;
		Stack<Node> stack = new Stack<Node>();
		while(node!=null){
			stack.push(node.left);
		}
		
		while(!stack.isEmpty()){
			node=stack.pop();
			temp++;
			if(temp==kthElement)
				return node;
			if(node.right!=null)
				node=node.right;
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
		}
		return node;
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
	
	
	public static void main(String args[]){
		KthSmallestEleemt tree = new KthSmallestEleemt();
		tree.insertN(20);
		tree.insertN(8);
		tree.insertN(4);
		tree.insertN(22);
		tree.insertN(12);
		tree.insertN(10);
		tree.insertN(14);

		Node resultNode = tree.findKthElement(tree.root, 5);
		System.out.println(resultNode.key);
	}
	
}
