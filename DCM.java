import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/***************************
	Diagonal Constant Matrix
	Shahzore Qureshi
 ****************************/
public class DCM {

  public static void main (String[] args) throws Exception {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> tempRow = new ArrayList<Integer>();
		int rowNumber = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				Integer integer = Integer.valueOf(args[i]);
				tempRow.add(integer);	
			} catch (Exception e) {
				//If input is not a number, treat the input as an "End of Row" character.
				matrix.add(rowNumber, tempRow);
				tempRow = new ArrayList<Integer>();
				rowNumber++;
			}
		}

		//Print out matrix
		for(ArrayList<Integer> r : matrix) {
			System.out.print("[");
			for(Integer integer : r) {
				System.out.print(" " + integer + " ");
			}
			System.out.println("]");
		}

    Queue<Integer> queue = new LinkedList<Integer>();

		for(int i = 0; i < matrix.size(); i++) {
			ArrayList<Integer> row = matrix.get(i);
			for(int j = 0; j < row.size(); j++) {
					if(i == 0) {
						//If this is the first row in the matrix,
						//add integer to queue if it is not at
						//the end of the row.
						if(j != row.size() - 1) {
							queue.add(row.get(j));
							System.out.println("added " + row.get(j) + " to queue");
						}
					} else if(i > 0 && i < matrix.size() - 1) {
						//If this is a row that is neither first nor last,
						//and the integer is the first of the row, add it
						//to the queue.
						if(j == 0) {
							queue.add(row.get(j));
							System.out.println("added " + row.get(j) + " to queue");
						} else {
							Integer integer = queue.remove();
							if(row.get(j) != integer) {
								throw new Exception("Matrix is not diagonal constant.");
							}
							if(j != row.size() - 1) {
								queue.add(integer);
							}
						}
					} else if(i == matrix.size() - 1) {
						if(j > 0) {
							Integer integer = queue.remove();
							if(row.get(j) != integer) {
								throw new Exception("Matrix is not diagonal constant.");
							}
						}
					}
			}
		}	

		if(queue.size() == 0) {
			System.out.println("Matrix is diagonal constant.");
		} else {
			System.out.println("Matrix is not diagonal constant.");
		}

  }

}
