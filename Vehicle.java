// abstract Vehicle class which Vehicle types such as Car will extend

public abstract class Vehicle implements Runnable {
	
	//private instance variables
	private String symbol; 
	private int speed;
	private int startRow;
	private int x; 
	private int y;
	private GridSquare[][] gridSquareArray;
	private GeneratorDetails generator;
	
	
	//-----------Getters-----------------//
	
	// return String symbol representing Vehicle
	public String getSymbol() {
		return this.symbol;
	}
	
	// return int speed representing speed (delay) of Vehicle
	public int getSpeed() {
		return this.speed;
	}
	
	// return int startRow representing row of rotated grid
	public int getStartRow() {
		return this.startRow;
	}
	
	// return int x representing the row of rotated grid adjusted for 0 based index
	public int getXPosition() {
		return this.x;
	}
	
	// return int y representing the column of rotated grid adjusted for 0 based index
	public int getYPosition() {
		return this.y;
	}
	
	// return GridSquare [][] gridSquareArray representing 2d array of GridSquares 
	public GridSquare[][] getGridSquareArray(){
		return this.gridSquareArray;
	}
	
	// return GeneratorDetails generator representing generator interface to pass to Vehicles
	public GeneratorDetails getGenerator() {
		return this.generator;
	}
	
	//-----------------------------------//
	
	
	//-----------Setters-----------------//
	
	// set the symbol representing the String representation of the Vehicle object
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	// set the constant speed (delay) of a Vehicle object 
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// set the startRow of the (possibly rotated) grid
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	
	// set the row position of the (possibly rotated) grid adjusted for 0 based index
	public void setXPosition(int xPosition) {
		this.x = xPosition;
	}
	
	// set the column position of the (possibly rotated) grid adjusted for 0 based index
	public void setYPosition(int yPosition) {
		this.y = yPosition;
	}
	
	// set the GridSquare[][] gridSquareArray for the Vehicle object
	public void setGridSquareArray(GridSquare[][] gridSquareArray) {
		this.gridSquareArray = gridSquareArray;
	}
	
	// set the GeneratorDetails generator to maintain a reference to the generator that created the Vehicle object
	public void setGenerator(GeneratorDetails generator) {
		this.generator = generator;
	}
	
	//---------------------------------------//
	
	
	//-----------Abstract Methods------------//
	
	public abstract void run();
	
	//---------------------------------------//
	
	
	
	// return String detailing information about the Vehicle
	public String toString() {
		return String.format("Symbol: %s, Speed: %s, StartRow: %s", this.symbol, this.speed, this.startRow);
	}
}
