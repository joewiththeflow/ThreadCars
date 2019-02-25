import java.util.ArrayList;

public class APSpec2 {
	public static void main(String[] args) throws InterruptedException {

		// create a grid of GridSquares, 10 by 20, as mentioned in the spec
		GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		
		// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the East
		// Cars are created for rows 1 - 5 inclusive
		VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray,
				new int[] { 1, 2, 3, 4, 5 });
		// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
		carGen1.changeSpeedRange(200, 400);
		// The 'generationSpeedRange' is set (The next Car will be generated after a random delay from this range)
		carGen1.changeGenerationSpeedRange(250, 500);
		Thread cg = new Thread(carGen1);
		cg.start();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the South
		// Cars are created for columns 1 - 10 inclusive 
		VehicleGenerator carGen2 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray,
				new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
		carGen2.changeSpeedRange(200, 400);
		// The 'generationSpeedRange' is set (The next Car will be generated after a random delay from this range)
		carGen2.changeGenerationSpeedRange(750, 1000);
		Thread cg2 = new Thread(carGen2);
		cg2.start();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the North
		// Cars are created for columns 11 - 20 inclusive
		VehicleGenerator carGen3 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray,
				new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 });
		// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
		carGen3.changeSpeedRange(50, 150);
		// The 'generationSpeedRange' is set (The next Car will be generated after a random delay from this range)
		carGen3.changeGenerationSpeedRange(250, 500);
		Thread cg3 = new Thread(carGen3);
		cg3.start();
		
		// create a VehicleGenerator that creates Cars which start by facing towards the West
		// Cars are created for rows 6 - 10 inclusive
		VehicleGenerator carGen4 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray,
				new int[] { 6, 7, 8, 9, 10 });
		// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
		carGen4.changeSpeedRange(50, 150);
		// The 'generationSpeedRange' is set (The next Car will be generated after a random delay from this range)
		carGen4.changeGenerationSpeedRange(750, 1000);
		Thread cg4 = new Thread(carGen4);
		cg4.start();
		
		// create an array list of GeneratorStats to pass to a newly created Statistics object
		// The VehicleGenerators are added to the  array list - the Vehiclegenerators implement the GeneratorStats interface
		ArrayList<GeneratorStats> carGens = new ArrayList<GeneratorStats>();
		carGens.add(carGen1);
		carGens.add(carGen2);
		carGens.add(carGen3);
		carGens.add(carGen4);
		Statistics stats = new Statistics(carGens);
		
		// create a a GridDrawer object which will draw the grid 2000 times
		// a reference to the Statistics object is passed in order that the GridDrawer call the report method in stats when finished
		GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000, stats);
		Thread gd = new Thread(gridDrawer);
		gd.start();
		
		// join threads to main
		gd.join();
		cg.join();
		cg2.join();
		cg3.join();
		cg4.join();

	}
}
