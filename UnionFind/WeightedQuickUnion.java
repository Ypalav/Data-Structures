package UnionFind;

public class WeightedQuickUnion {
	private int id[];
	private int size[];

	public WeightedQuickUnion(int N) {
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}

	private int root(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];//for path compression(path halving)
			i = id[i];
		}
		return i;
	}

	public boolean isConnected(int v, int w) {
		return root(v) == root(w);
	}

	public void union(int i, int j) {
		int pid = root(i);
		int qid = root(j);

		if (size[pid] < size[qid]) {
			id[pid] = id[qid];
			size[qid] += size[pid];
		} else {
			id[qid] = id[pid];

			size[pid] += size[qid];
		}
	}

}
