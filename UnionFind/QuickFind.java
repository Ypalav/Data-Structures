package UnionFind;

public class QuickFind {
	private int[] id;

	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	public boolean isConnected(int v, int w) {
		return id[v] == id[w];
	}

	public void union(int i, int j) {
		int p_i = id[i];
		int q_j = id[j];
		for (int k = 0; k < id.length; k++) {
			if (id[k] == p_i)
				id[k] = q_j;
		}
	}
	
	

}
