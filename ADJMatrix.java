import java.util.Arrays;
import java.util.Random;

public class ADJMatrix {
	static int l = 5;
	static int w = 5;
	// A user define class to represent a graph.
	// A graph is an adjacency matrix.
	// Size of array will be V (number of vertices
	// in graph)

	public static void main(String[] args) {
		int[][] matrix = new int[l][w];
		Random rand = new Random();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < w; j++) {
				matrix[i][j] = rand.nextInt(2);
			}
		}
	
		for (int i = 0; i < l; i++) {
			System.out.print("{ " );
			for (int j = 0; j < w; j++) {
				System.out.print(matrix[i][j]);
				if (j == w - 1) {
					System.out.print("},\n");
				}
				else
					System.out.print(", " );

			}
			System.out.print("");
		}
	}

}
