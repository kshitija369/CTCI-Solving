package stringQuesSoln;

public class ZeroMatrix {
	
	public static void main(String[] args){	
		int[][] mat1 = { {1,0,1,1}, {5,1,6,0}, {1,2,3,4}};
		int row = 3; int col = 4;
		mat1 = zeroMatrix(mat1, row, col);
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}	
		int[][] mat2 =  { {1,0,2}, {3,4,5}, {0,6,7}, {1,2,3}};
		row = 4; col = 3;
		mat2 = zeroMatrix(mat2, row, col);
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}
	}	
	
	// Ch01_Q08 / Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, 
	// its entire row and column are set to 0.
	public static int[][] zeroMatrix(int[][] mat1, int row, int col){
		int[] arrRow = new int[row];
		int[] arrCol = new int[col];
		
		for(int i=0; i < row; i++){
			arrRow[i] = 1;
		}
		for(int j=0; j < col; j++){
			arrCol[j] = 1;
		}
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				if(mat1[i][j] == 0){
					arrRow[i]=0;
					arrCol[j]=0;
				}
			}
		}	
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				mat1[i][j] = mat1[i][j]*arrRow[i]*arrCol[j];
			}
		}
		return mat1;
	}
	
}
