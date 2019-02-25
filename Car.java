// class used to create Car objects
// can run on own thread
// extends Vehicle class

public class Car extends Vehicle implements Runnable {
	
	// constructor for Car which requires:
		// 	- a String symbol to represent this Car object
		//	- a 2d GridSquare array to represent the grid (possibly rotated) which the Car will travel through
		//	- an integer startRow to indicate which row of (possibly rotated) grid the Car should move along
		// 	- an integer speed to indicate the fixed 'speed' or delay which occurs before a Car attempts to move into the next GridSquare
		//	- a GeneratorDetails gen to maintain a reference to the VehicleGenerator which created the Car and access appropriate methods
	public Car(String symbol, GridSquare[][] gridSquareArray, int startRow, int speed, GeneratorDetails gen) { 
		
		// use setters to access variables declared private in Generator parent class
		setSymbol(symbol);
		setSpeed(speed);
		setGridSquareArray(gridSquareArray);
		setStartRow(startRow);
		setXPosition(startRow - 1); //adjust for 0 index based grid array
		setYPosition(0);
		setGridSquareArray(gridSquareArray);
		setGenerator(gen);

	}
	
	public void run() {
		//record time when thread starts
		long start = (System.currentTimeMillis());
		//store the previous square - can only remove when car has definitely moved to next square
		GridSquare previousSquare = null; 
		
		for(int i = 0; i < getGridSquareArray()[0].length; i++) {
			
			GridSquare square = getGridSquareArray()[getXPosition()][getYPosition()];
			//try to add this car to the square [x][y]
			square.setVehicle(this);
			//if there is a previousSquare that was occupied by this car, now that it has definitely moved to a new square
			// it can vacate the previousSquare to allow other vehicles to move into that square
			if(previousSquare != null) {
				//if there is a previousSquare for this car, tell it that there is no longer a car in that square
				previousSquare.setHasVehicle(false); 
			}
			//ensure that previousSquare for the next loop iteration is the value of square for this loop iteration
			previousSquare = square;
			//increment y so that next loop tries to add car to next square along
			setYPosition(getYPosition() + 1);
			try {
				//stay in the square for a while before trying to move into next square
				Thread.sleep(getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//assume car can freely move off the grid at the end, but remember to remove car from last square
		previousSquare.setHasVehicle(false);
		//work out time taken for this car to travel across the grid
		double timeTaken = ((System.currentTimeMillis()) - start) / 1000.0;
		//add timeTaken to the generator that created this car
		getGenerator().addTimeTaken(timeTaken);
	}
}
