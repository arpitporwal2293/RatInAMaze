
public class RatInAMaze {
	
	public static int N;
	
	public boolean CheckPathUtils(int[][] matrix,int row,int col,int[][] awsMatrix){
		if(row == N-1 && col == N-1){
			awsMatrix[row][col] = 1;
			return true;
		}else{
			if(isSafe(matrix, row, col)){
				awsMatrix[row][col] = 1;
				if(CheckPathUtils(matrix,row+1,col,awsMatrix)==true)
					return true;
				if(CheckPathUtils(matrix,row,col+1,awsMatrix)==true)
					return true;
				
				awsMatrix[row][col] = 0;
				return false;
			}
		}
		return false;
	}
	
	public boolean isSafe(int[][] matrix,int row,int col){
		if(row>=0 && row<N && col>=0 && col<N && matrix[row][col]==1){
			return true;
		}
		return false;
	}
	
	public void printSolution(int[][] maze){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		N = 4;
		RatInAMaze aMaze = new RatInAMaze();
		int awsmaze[][] = new int[N][N];
		int maze[][]  =  { {1, 0, 0, 0},
		        {1, 1, 0, 1},
		        {0, 1, 0, 0},
		        {1, 1, 1, 1}
		    };
		 
		    System.out.println(aMaze.CheckPathUtils(maze, 0, 0,awsmaze));
		    aMaze.printSolution(awsmaze);
	}

}
