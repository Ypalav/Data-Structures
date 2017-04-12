package ArraysAndStrings;

public class RotateMatrix {
	public boolean rotateMatrix(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			return false;

		int len = matrix.length;
		for (int layer = 0; layer < len / 2; layer++) {
			int first = layer;
			int last = len - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		printMatrix(matrix);
		return true;

	}

	public void newRotateMatrix(int [][]inpMatrix){
		int sizeOfMatrix=inpMatrix.length-1;
		int count=0;
		for(int j=0;j<sizeOfMatrix;j++){
			for(int i=sizeOfMatrix-1;i>j;i--){
				int temp=inpMatrix[i][i-j];
				inpMatrix[i][i-j]=inpMatrix[i+j][i];
				inpMatrix[i+j][i]=inpMatrix[j][i+j];
				inpMatrix[j][i+j]=inpMatrix[i-i][j];
				inpMatrix[i-i][j]=temp;
			}
		}
	}
	
	public void printMatrix(int[][] inpMatrix) {
		for (int i = 0; i < inpMatrix.length; i++) {
			for (int j = 0; j < inpMatrix.length; j++) {
				System.out.print(inpMatrix[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		RotateMatrix matrix = new RotateMatrix();
		int[][] inpMatrix = new int[3][3];
		matrix.printMatrix(inpMatrix);
		inpMatrix[0][0] = 1;
		inpMatrix[0][1] = 2;
		inpMatrix[0][2] = 3;
		inpMatrix[1][0] = 4;
		inpMatrix[1][1] = 5;
		inpMatrix[1][2] = 6;
		inpMatrix[2][0] = 7;
		inpMatrix[2][1] = 8;
		inpMatrix[2][2] = 9;
		//matrix.printMatrix(inpMatrix);
		//matrix.rotateMatrix(inpMatrix);
		
	}
}
