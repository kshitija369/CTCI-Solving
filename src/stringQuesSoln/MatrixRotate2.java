package stringQuesSoln;

public class MatrixRotate2 {
	
	public static void main(String[] args){	
		int[][] mat1 = { {1,0,1,1}, {5,1,6,0}, {1,2,3,4}, {1,2,1,2}};
		int col = 4;
		mat1 = rotateMatrix(mat1, col);
		for(int i=0; i < col; i++){
			for(int j=0; j < col; j++){
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	// Ch01_Q07 / Rotate Matrix: Given an image represented by NxN matrix, 
	// where each pixel in the image is 4 bytes, write a method to rotate 
	// the image by 90 degrees. Can you do this in place?
	private static int[][]  rotateMatrix(int[][] mat1, int col) {
		
		int temp = 0;
		for(int i = 0; i < col/2; i++){
			for(int j = i; j < col-i-1; j++){
				temp = mat1[i][j];
				mat1[i][j] = mat1[j][col-1-i];
				mat1[j][col-1-i] = mat1[col-1-i][col-1-j];
				mat1[col-1-i][col-1-j] = mat1[col-1-j][i];
				mat1[col-1-j][i] = temp;
			}
		}
		return mat1;
	}
}
