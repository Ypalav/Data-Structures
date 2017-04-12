public class KDistantNodes {
	Node root;
	public void printKDistant(Node node, int k){
		if(node==null){
			return;
		}
		if(k==0){
			System.out.println(node.key+" ");
			return;
		}else{
			printKDistant(node.left, k-1);
			printKDistant(node.right, k-1);
		}
	}
	
	public static void main(String args[]){
		KDistantNodes nodes=new KDistantNodes();
		nodes.root=new Node(1);
		nodes.root.left=new Node(2);
		nodes.root.right=new Node(3);
		nodes.root.left.left=new Node(4);
		nodes.root.left.right=new Node(5);
		nodes.root.right.left=new Node(8);
		nodes.printKDistant(nodes.root, 0);
	}
	
}
