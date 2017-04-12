import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int mRows = a.size();
		int nCols = a.get(0).size();

		int row = 0, col = 0, layer = 0;
		int direction = 0;

		result.add(a.get(0).get(0));

		for (int i = 1; i < mRows * nCols; i++) {
			switch (direction) {
			case 0:
				if (col == nCols - layer - 1) {
					direction = 1;
					row++;
				} else {
					col++;
				}
				break;
			case 1:
				if (row == mRows - layer - 1) {
					direction = 2;
					col--;
				} else {
					row++;
				}
				break;
			case 2:
				if (col == layer) {
					direction = 3;
					row--;
				} else {
					col++;
				}
				break;
			case 3:
				if (row == layer - 1) {
					direction = 0;
					col++;
					layer++;
				} else {
					row--;
				}
				break;
			}
			result.add(a.get(row).get(col));
		}

		return result;
	}

	public static void main(String args[]){
		SpiralMatrix matrix = new SpiralMatrix();
		List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		
		matrix.spiralOrder(a);
	}
}
