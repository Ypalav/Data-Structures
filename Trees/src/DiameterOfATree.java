
public class DiameterOfATree {
	class Height{
		int h;
	}
	
	Node root;
	
	int diameter(Node root, Height height){
		Height lh=new Height();
		Height rh=new Height();
		
		if(root==null){
			height.h=0;
			return 0;
		}
		
		lh.h++; rh.h++;
		int ldiameter=diameter(root.left, lh);
		int rdiameter=diameter(root.right, rh);
		height.h=Math.max(lh.h, rh.h) + 1;
		return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
	}
	
	int diameterWrapper(Node node)
    {
        Height height = new Height();
        return diameter(node, height);
    }
	
	public static void main(String args[]){
		DiameterOfATree dTree = new DiameterOfATree();
		dTree.root=new Node(1);
		dTree.root.left=new Node(2);
		dTree.root.right=new Node(3);
		dTree.root.left.left=new Node(4);
		dTree.root.left.right=new Node(5);
		
		System.out.println(dTree.diameterWrapper(dTree.root));
	}
}
