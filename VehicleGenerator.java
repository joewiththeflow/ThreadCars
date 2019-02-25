// class used to create VehicleGenerator objects which produce Vehicles
// extends Generator
// can run on its own thread to generate Vehicles continuously

public class VehicleGenerator extends Generator implements Runnable, GeneratorStats, GeneratorDetails {
	
	//private instance variables
	private VehicleFactory vehicleFactory;
	private String vehicleName; //type of Vehicle generated depends on this name

	// constructor for VehicleGenerator which requires:
	// 	- a VehicleFactory object
	//	- a vehicleName to specify the type of vehicle this generator should create e.g. "Car" for Car objects
	//	- a direction that generated Vehicles should face when generated e.g. 'N' for North facing
	// 	- a symbol to represent the generated vehicles from this generator e.g. "N"
	//	- a 2d GridSquare array to represent the grid which Vehicles travel through
	//	- an integer array specifying the individual rows (or columns depending on direction provided) this generator should generate Vehicles in
	public VehicleGenerator(VehicleFactory vehicleFactory, String vehicleName, char direction, String symbol,
			GridSquare[][] gridSquareArray, int[] rowsOrColumns) {
		
		// set private instance variables
		this.vehicleFactory = vehicleFactory;
		this.vehicleName = vehicleName;
		
		// use setters to access variables declared private in Generator parent class
		setName("" + direction + " Generator"); // a default name for a generator based on direction
		setSymbol(symbol);
		setDirection(direction);
		setGridSquareArray(gridSquareArray);
		setGridOrientation(direction);
		setRowsOrColumns(rowsOrColumns);
		setMinSpeed(25); // a default minSpeed
		setMaxSpeed(400); // a default maxSpeed
		setMinGenerationSpeed(1000); // a default minGenerationSpeed
		setMaxGenerationSpeed(1000); // a default maxGenerationSpeed
	}
	
	// constructor for VehicleGenerator which applies to all rows (or columns depending on direction provided.
	//requires:
		// 	- a VehicleFactory object
		//	- a vehicleName to specify the type of vehicle this generator should create e.g. "Car" for Car objects
		//	- a direction that generated Vehicles should face when generated e.g. 'N' for North facing
		// 	- a symbol to represent the generated vehicles from this generator e.g. "N"
		//	- a 2d GridSquare array to represent the grid which Vehicles travel through
	public VehicleGenerator(VehicleFactory vehicleFactory, String vehicleName, char direction, String symbol,
			GridSquare[][] gridSquareArray) {
		
		// set private instance variables
		this.vehicleFactory = vehicleFactory;
		this.vehicleName = vehicleName;
		
		// use setters to access variables declared private in Generator parent class
		setName("" + direction + " Generator"); // a default name for a generator based on direction
		setSymbol(symbol);
		setDirection(direction);
		setGridSquareArray(gridSquareArray);
		setGridOrientation(direction);
		setRowsOrColumns(); // set to generate in all rows (or columns) from the newly oriented 2d array of GridSquares
		setMinSpeed(25); // a default minSpeed
		setMaxSpeed(400); // a default maxSpeed
		setMinGenerationSpeed(1000); // a default minGenerationSpeed
		setMaxGenerationSpeed(1000); // a default maxGenerationSpeed
	}
	
	// run method to specify VehiclGenerator's behaviour when running on its own thread 
	public void run() {
		while (true) {
			// create a new Vehicle, the specific type of which is determined by the vehicleName
			Vehicle vehicle = vehicleFactory.buildVehicle(vehicleName, getSymbol(), getGridSquareArray(),
					startRow(getDirection()), speed(), this);
			// create a new thread for the newly created Vehicle and start the thread
			Thread c1 = new Thread(vehicle);
			c1.start();
			// pause for value in milliseconds defined by generationSpeed() method
			try {
				Thread.sleep(generationSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
