package ArraysAndStrings;

import java.util.ArrayList;

public class ZeroMatrix {
	public void zeroMatrix(int[][] inpMatrix) {

		boolean rows[] = new boolean[inpMatrix.length];
		boolean cols[] = new boolean[inpMatrix[0].length];

		for (int i = 0; i < inpMatrix.length; i++) {
			for (int j = 0; j < inpMatrix[0].length; j++) {
				if (inpMatrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0; i < rows.length; i++) {
			if (rows[i])
				nullifyRow(inpMatrix, i);
		}

		for (int i = 0; i < cols.length; i++) {
			if (cols[i])
				nullifyCols(inpMatrix, i);
		}

		printMatrix(inpMatrix);
	}

	private void nullifyRow(int[][] inpMatrix, int row) {
		for (int i = 0; i < inpMatrix[0].length; i++) {
			inpMatrix[row][i] = 0;
		}

	}

	private void nullifyCols(int[][] inpMatrix, int col) {
		// TODO Auto-generated method stub
		for (int i = 0; i < inpMatrix.length; i++) {
			inpMatrix[i][col] = 0;
		}
	}

	public void zeroMatrixSpaceEff(int[][] inpMatrix) {
		boolean checkForRows = false;
		boolean checkForCols = false;
		for (int i = 0; i < inpMatrix[0].length; i++) {
			if (inpMatrix[0][i] == 0) {
				checkForRows = true;
				break;
			}
		}

		for (int i = 0; i < inpMatrix.length; i++) {
			if (inpMatrix[i][0] == 0) {
				checkForCols = true;
				break;
			}
		}

		for (int i = 1; i < inpMatrix.length; i++) {
			for (int j = 1; j < inpMatrix[0].length; j++) {
				if (inpMatrix[i][j] == 0) {
					inpMatrix[i][0] = 0;
					inpMatrix[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < inpMatrix.length; i++) {
			if (inpMatrix[i][0] == 0)
				nullifyRow(inpMatrix, i);
		}

		for (int i = 1; i < inpMatrix[0].length; i++) {
			if (inpMatrix[0][i] == 0)
				nullifyCols(inpMatrix, i);
		}

		if (checkForRows)
			nullifyRow(inpMatrix, 0);

		if (checkForCols)
			nullifyCols(inpMatrix, 0);

		printMatrix(inpMatrix);

	}

	public void printMatrix(int[][] inpMatrix) {
		for (int i = 0; i < inpMatrix.length; i++) {
			for (int j = 0; j < inpMatrix[0].length; j++) {
				System.out.print(inpMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		ZeroMatrix matrix = new ZeroMatrix();
		int[][] inpMatrix = new int[3][2];
		inpMatrix[0][0] = 1;
		inpMatrix[0][1] = 2;
		// inpMatrix[0][2] = 3;
		inpMatrix[1][0] = 0;
		inpMatrix[1][1] = 5;
		// inpMatrix[1][2] = 6;
		inpMatrix[2][0] = 7;
		inpMatrix[2][1] = 8;
		// inpMatrix[2][2] = 9;
		matrix.printMatrix(inpMatrix);
		System.out.println();
		//matrix.zeroMatrix(inpMatrix);
		matrix.zeroMatrixSpaceEff(inpMatrix);
	}
}
