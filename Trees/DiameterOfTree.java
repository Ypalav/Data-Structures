package trees;

class Height {
	int h;
}

public class DiameterOfTree {
	BinaryTreeNode root;

	public int findDiameterWrapper(BinaryTreeNode node) {
		Height h = new Height();
		return findDiameter(root, h);
	}

	private int findDiameter(BinaryTreeNode node, Height h) {
		// TODO Auto-generated method stub
		Height lh = new Height();
		Height rh = new Height();
		if (node == null) {
			h.h = 0;
			return 0;
		}
		lh.h++;
		rh.h++;
		int leftDiameter = findDiameter(node.getLeft(), lh);
		int rightDiameter = findDiameter(node.getRight(), rh);
		h.h = Math.max(lh.h, rh.h) + 1;
		return Math.max(lh.h + rh.h + 1, Math.max(leftDiameter, rightDiameter));
	}
}
