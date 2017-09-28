package stringQuesSoln;

public class MatrixRotation {
	public static int[][] mat1 = { {1,0,1,1}, {5,1,6,0}, {1,2,3,4}};
	public static int row = 3; public static int col = 4;
	
	public static void main(String[] args){	
		rotateMatrix(row, col, 2);
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	// Ch01_Q07 / Rotate Matrix: Given an image represented by NxN matrix, 
	// where each pixel in the image is 4 bytes, write a method to rotate 
	// the image by 90 degrees. Can you do this in place?
	private static void rotateMatrix(int row, int col, int n) {		
		for(int i=0; i<row; i++){
			reverse(0, col, i);
			//split the array
			int end = col - n;
			// reverse both the splits
			reverse(0, end, i);
			// reverse both the splits
			reverse(end, col, i);
		}
	}	
	
	private static void reverse(int i, int len, int currRow) {
		len = len - 1;
		int temp;
		while(i < len){
			temp = mat1[currRow][i];
			mat1[currRow][i++] = mat1[currRow][len];
			mat1[currRow][len--] = temp;
		}
	}
}
