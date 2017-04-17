package trees;

public class PrintPath {
	BinaryTreeNode root;

	public void printPaths(BinaryTreeNode root) {
		int[] paths = new int[256];
		printPaths(root, paths, 0);
	}

	private void printPaths(BinaryTreeNode root, int[] paths, int i) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		paths[i++] = root.getData();
		if (root.getLeft() == null && root.getRight() == null)
			printPathArray(paths, i);
		else {
			printPaths(root.getLeft(), paths, i);
			printPaths(root.getRight(), paths, i);
		}
	}

	private void printPathArray(int[] paths, int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < i; j++)
			System.out.print(paths[j] + " ");
		System.out.println();
	}

}
