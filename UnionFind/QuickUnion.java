package UnionFind;

public class QuickUnion {
	private int[] id;

	public QuickUnion(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	public boolean isConnected(int v, int w) {
		return root(v) == root(w);
	}

	public void union(int i, int j) {
		int pid = root(i);
		int qid = root(j);
		id[pid] = qid;
	}

}
