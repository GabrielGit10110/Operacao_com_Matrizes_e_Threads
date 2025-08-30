package view;

import controller.MatrixController;

public class Main {
	public static void main(String[] args) {
		int[][] matrix = new int[3][5];
		
		fillMatrix(matrix);
		showMatrix(matrix);
		
		for (int[] line : matrix) {
			MatrixController mC = new MatrixController(line);
			mC.start();
		}
		
	}
	
	// fill the matrix with random integers
	private static void fillMatrix(int[][] matrix) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = (int)(Math.random() * 50) + 1;
			}
		}
		
	}
	
	// show all the integers inside the matrix
	private static void showMatrix(int[][] matrix) {
		
		for (int[] line : matrix) {
			for (int element : line) {
				System.out.print(element + " ");
				
			}
			System.out.println("\n");
			
		}
		
	}

}
