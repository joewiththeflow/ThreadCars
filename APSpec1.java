
public class APSpec1 {
	public static void main(String[] args) throws InterruptedException {
		
		//create a grid of GridSquares, 10 by 20, as mentioned in the spec
		GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
		//create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the East
		// each Car will have a constant 'speed', selected at random from a default range 
		// Cars are created for all rows
		VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray);
		Thread cg1 = new Thread(carGen1);
		cg1.start();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the South
		// each Car will have a constant 'speed', selected at random from a default range 
		// Cars are created for all columns
		VehicleGenerator carGen2 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray);
		Thread cg2 = new Thread(carGen2);
		cg2.start();
	    
		// create a a GridDrawer object which will draw the grid 2000 times
	    GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000);
		Thread gd = new Thread(gridDrawer);
		gd.start();
		
		// join threads to main
		gd.join();
		cg1.join();
		cg2.join();
		
	}
}
