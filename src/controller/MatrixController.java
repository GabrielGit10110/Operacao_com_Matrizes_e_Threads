package controller;

public class MatrixController extends Thread {
	private int[] line;
	
	public MatrixController(int[] line) {
		this.line = line;
	}
	
	@Override
	public void run() {
		getThreadId();
		sumOfLines(line);

	}
	
	private static void sumOfLines(int[] line) {
		int sum = 0;
		
		for (int i : line) {
			sum = sum + i;
		}
		
		System.out.println("A soma da linha é: " + sum);
	}
	
	private void getThreadId() {
		
		int tid = (int) getId();
		
		System.out.print("#"+tid+" ");
		
	}
}
