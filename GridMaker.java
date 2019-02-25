// A class used to help create and rotate 2d GridSquare arrays

public class GridMaker {
	
	//create a 2d array of instantiated GridSquares and return this array
	public static GridSquare[][] generateGrid(int rows, int columns) {
		GridSquare[][] gridSquareArray = new GridSquare[rows][columns];
		for(int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				gridSquareArray[i][j] = new GridSquare();
			}
		}
		return gridSquareArray;
	}
	
	// rotate a given 2d array of GridSquares 90 degrees anti-clockwise
	// do this as many times as specified in the numOfTurns parameter
	// numOfTurns must be a positive integer with a value of at least 1 for any rotation to take place
	// return the rotated 2d array of GridSquares
	public static GridSquare[][] turnGridAntiClockwise(GridSquare[][] gridSquareArray, int numOfTurns){
				
		//create a 2d array variable to store the new array (turned grid)
		GridSquare[][] newGridSquareArray;
		
		//check to see if numOfTurns is less than or equal to 0 and return unrotated 2d grid array if so
		if(numOfTurns <= 0) {
			return gridSquareArray;
		}
		
		//loop through the turning process for the numOfTurns
		for(int turns = 1; turns <= numOfTurns; turns++) {
			//initialise the array variable to hold the rearranged gridSquareArray
			newGridSquareArray = new GridSquare[gridSquareArray[0].length][gridSquareArray.length];
			//loop through the rows of the original array gridSquareArray (these become columns in newGridSquareArray)
			for(int i = 0; i < gridSquareArray.length; i++) {
				//loop backwards through the columns of the original gridSquareArray (these become rows in newGridSquareArray)
				for(int j = gridSquareArray[0].length - 1; j >= 0; j--) {
					//add row items from original array into columns in new array
					newGridSquareArray[(gridSquareArray[0].length - 1) - j][i] = gridSquareArray[i][j];
				}
			}
			//make gridSquareArray equal to newGridSquareArray for next iteration of loop
			gridSquareArray = newGridSquareArray;
		}
		//return rotated grid
		return gridSquareArray;
	}
}
