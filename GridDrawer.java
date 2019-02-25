// A class used to create a GridDrawer object which will draw a GridSquare array
// a defined number of times, as well as reference a Statistics object in order that
// a report can be generated

public class GridDrawer implements Runnable{
	
	//private instance variables
	private int numberOfDraws;
	private GridSquare[][] gridSquareArray;
	private Statistics stats;
	
	//constructor for GridDrawer which requires:
	// - a 2d GridSquare array 
	// - a number of times to draw the contents of the GridSquare array to the screen
	// - a Statistics object to create a report
	public GridDrawer(GridSquare[][] gridSquareArray, int numberOfDraws, Statistics stats) {
		this.gridSquareArray = gridSquareArray; 
		this.numberOfDraws = numberOfDraws;
		this.stats = stats;
	}
	
	//constructor for GridDrawer which requires:
		// - a 2d GridSquare array 
		// - a number of times to draw the contents of the GridSquare array to the screen
	public GridDrawer(GridSquare[][] gridSquareArray, int numberOfDraws) {
		this.gridSquareArray = gridSquareArray; 
		this.numberOfDraws = numberOfDraws;
		this.stats = null;
	}
	
	// A method which will output the contents of the 2d GridSquare array to the screen
	public void writeGrid() {
		String report = "\n";
		
		//create a dashed border around the top of the drawn grid
		for(int i = 0; i < gridSquareArray[0].length; i++) {
			report += "----";
		}
		report += "\n";
		
		//draw the array of gridSquares by querying each GridSquare's current contents
		for(int i = 0; i < gridSquareArray.length; i++) {
			for(int j = 0; j < gridSquareArray[0].length; j++) {
				report += "| " + gridSquareArray[i][j].toString() + " ";
			}
			report += "| \n";
		}
		
		//create a dashed border around the bottom of the drawn grid
		for(int i = 0; i < gridSquareArray[0].length; i++) {
			report += "----";
		}
		report += "\n";
		System.out.println(report);
	}

	// run method to specify behaviour of GridDrawer object
	public void run() {
		//draw the array of GridSquares n times, n being the numberOfDraws
		for (int i = 0; i < numberOfDraws; i++) {
				writeGrid();
			try {
				// sleep for 20 milliseconds
				Thread.sleep(20);
			}catch(InterruptedException e) {}
		}
		//call the write report method of stats (Statistics object) and exit the program
		if(stats != null) {
			System.out.println(stats.writeReport());
		}
		// exit the program
		System.exit(0);
	}
}
