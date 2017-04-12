
public class IsBinaryTree {
	Node root;
	Node prev;
	boolean isBST(){
		prev=null;
		return isBST(root);
	}
	private boolean isBST(Node node) {
		// TODO Auto-generated method stub
		if(node!=null){
			if(!isBST(node.left))
				return false;
			
			if(prev!=null && node.key<=prev.key)
				return false;
			prev=node;
			return isBST(node.right);
		}
		return true;
	}
	
	public static void main(String args[]){
		IsBinaryTree tree = new IsBinaryTree();
		tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        
        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
	}
	
}
