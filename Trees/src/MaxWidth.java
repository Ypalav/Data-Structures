import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class MaxWidth {
	Node root;
	public int calcWidth(Node node){
		Queue<Node> queue=new LinkedList<Node>();
		int result=0;
		queue.add(node);
		while(!queue.isEmpty()){
			int count = queue.size();
			result=Math.max(count, result);
			while(count>0){
				Node tempNode=queue.peek();
				queue.poll();
				if(tempNode.left!=null)
					queue.add(tempNode.left);
				if(tempNode.right!=null)
					queue.add(tempNode.right);
				count--;
			}
		}
		return result;
		
	}
	public static void main(String args[]){
		MaxWidth mWidth=new MaxWidth();
		mWidth.root=new Node(1);
		mWidth.root.left=new Node(2);
		mWidth.root.right=new Node(3);
		mWidth.root.left.left=new Node(4);
		mWidth.root.left.right=new Node(5);
		mWidth.root.right.right=new Node(8);
		mWidth.root.right.right.left=new Node(6);
		mWidth.root.right.right.right=new Node(7);
		
		System.out.println(mWidth.calcWidth(mWidth.root));
	}
}
