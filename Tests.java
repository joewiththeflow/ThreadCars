import java.util.ArrayList;
import java.util.Collections;

// This class is used to carry out tests to make sure the program is working as expected
// Each test can be uncommented in order to carry out that particular test.

// Test 1: Test that GridMaker class correctly creates a grid of GridSquares
// Test 2: These tests check that the GridDrawer class correctly draws the grid
// Test 3: check that the GridMaker class correctly rotates a grid anti-clockwise based on the number of turns
// Test 4: Create a car and manually move through Grid and test that run method
// in Car does the same thing automatically
// Test 5: Test that only one car can occupy a GridSquare at a time
// Test 6: Test VehicleGenerators create Cars as expected
// Test 7: Test Statistics

public class Tests {
	public static void main(String[] args) throws InterruptedException {

		
/////////////////////////////////////////////////////////////////////////////
// Test 1: These tests check that the GridMaker class correctly creates a
// grid of GridSquares of the specified size
 /////////////////////////////////////////////////////////////////////////////
 //
		 /*
		 // Test 1.1: create a grid of GridSquares, 10 by 20 
		 GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		 
		 // Test 1.2: create a grid of GridSquares, 1 by 1 
		 //GridSquare[][] gridSquareArray = GridMaker.generateGrid(1, 1);
		 
		 // Test 1.3: create a grid of GridSquares, 40 by 40 
		 //GridSquare[][] gridSquareArray = GridMaker.generateGrid(40, 40);
		 
		 // iterate over the grid and print out a number for each GridSquare in grid
		 for (int i = 0; i < gridSquareArray.length; i++) { for (int j = 0; j <
		 gridSquareArray[0].length; j++) { System.out.print(j+1 + "|"); }
		 System.out.println(); }
		 */
		
		
/////////////////////////////////////////////////////////////////////////////
// Test 2: These tests check that the GridDrawer class correctly draws the grid
		// using the writeGrid() method
/////////////////////////////////////////////////////////////////////////////
//
		/*
		// Test 2.1: test drawing a grid of GridSquares, 10 by 20
		// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		
		// Test 2.2: test drawing a grid of GridSquares, 1 by 1
		// GridSquare[][] gridSquareArray = GridMaker.generateGrid(1, 1);
		
		// Test 2.3: test drawing a grid of GridSquares, 40 by 40
		// GridSquare[][] gridSquareArray = GridMaker.generateGrid(40, 40);
		
		// Test 2.4: test drawing a grid of GridSquares, 10 by 20 and 
		// place a Car in row 4, column 5 and make sure this is displayed properly
		// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		// VehicleGenerator gen = new VehicleGenerator(new VehicleFactory(), "Car", 'N',"N", gridSquareArray);
		// Car car1 = new Car("X", gridSquareArray, 1, 0, gen);
		// gridSquareArray[3][4].setVehicle(car1);
		
		
		
		// iterate over the grid to print out grid
		System.out.println("Grid drawn by iterating over each Grid Square");
		//create a dashed border around the top of the drawn grid
				for(int i = 0; i < gridSquareArray[0].length; i++) {
					System.out.print("----");
				}
				System.out.println();
		// iterate over each String to print out the contents of the GridSquare
		for (int i = 0; i < gridSquareArray.length; i++) { 
			for (int j = 0; j <gridSquareArray[0].length; j++) { 
				System.out.print("| " + gridSquareArray[i][j].toString() + " "); 
			}
		System.out.println("| ");
		}
		//create a dashed border around the bottom of the drawn grid
		for(int i = 0; i < gridSquareArray[0].length; i++) {
			System.out.print("----");
		}
		System.out.println();
		
		// create GridDrawer object to draw the grid
		GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000);
		
		// draw Grid using writeGrid method in GridDrawer class
		System.out.println("Grid drawn with GridDrawer.writeGrid(): ");
		gridDrawer.writeGrid();
		
		
		// Test 2.5: test drawing a grid of GridSquares, 10 by 20 and test
		// grid drawing on its own thread for the number of times specified e.g. 2
		// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		// VehicleGenerator gen = new VehicleGenerator(new VehicleFactory(), "Car", 'N',"N", gridSquareArray);
		// Car car1 = new Car("X", gridSquareArray, 1, 0, gen);
		// gridSquareArray[3][4].setVehicle(car1);
		// GridDrawer gridDrawer2 = new GridDrawer(gridSquareArray, 2);
		// Thread gd = new Thread(gridDrawer2);
		// gd.start();

		*/
/////////////////////////////////////////////////////////////////////////////
// Test 3: These tests check that the GridMaker class correctly rotates a
// grid anti-clockwise based on the number of turns
/////////////////////////////////////////////////////////////////////////////
//
		  
		/*
		  // create a grid of GridSquares, 10 by 20, for the tests
		  GridSquare [][] gridSquareArray = GridMaker.generateGrid(10, 20);
		  
		  // iterate over the grid and place a vehicle of type Car in certain squares
		   VehicleGenerator gen = new VehicleGenerator(new VehicleFactory(), "Car", 'N',"N", gridSquareArray);
		   Car car1 = new Car("N", gridSquareArray, 1, 0, gen);
		   gridSquareArray[0][2].setVehicle(car1);
		   Car car2 = new Car("E", gridSquareArray, 1, 0, gen);
		   gridSquareArray[6][18].setVehicle(car2);
		   Car car3 = new Car("S", gridSquareArray, 1, 0, gen);
		   gridSquareArray[9][3].setVehicle(car3);
		   Car car4 = new Car("W", gridSquareArray, 1, 0, gen);
		   gridSquareArray[3][0].setVehicle(car4);
		  
		  // Test 3.1: show the original grid
		   
		  // Test 3.2: turn the grid 0 times
		  // gridSquareArray = GridMaker.turnGridAntiClockwise(gridSquareArray, 0);
		  
		  // Test 3.3: turn the grid 1 times
		  // gridSquareArray = GridMaker.turnGridAntiClockwise(gridSquareArray, 1);
		  
		  // Test 3.4: turn the grid 2 times
		  // gridSquareArray = GridMaker.turnGridAntiClockwise(gridSquareArray, 2);
		  
		  // Test 3.5: turn the grid 3 times
		  // gridSquareArray = GridMaker.turnGridAntiClockwise(gridSquareArray, 3);
		  
		  // Test 3.6: turn the grid 4 times
		  // gridSquareArray = GridMaker.turnGridAntiClockwise(gridSquareArray, 4);
		  
		// create GridDrawer object to draw the grid
		GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000); 
		 gridDrawer.writeGrid();
		 */
		
/////////////////////////////////////////////////////////////////////////////
// Test 4: Create a car and manually move through Grid and test that run method
// in Car does the same thing automatically
/////////////////////////////////////////////////////////////////////////////
//
		/* 
		// create a grid of GridSquares, 10 by 20, for the tests
		 GridSquare [][] gridSquareArray = GridMaker.generateGrid(10, 20);
		  
		// create a car and place it in a square on the grid, row 4, column 1
		 VehicleGenerator gen = new VehicleGenerator(new VehicleFactory(), "Car", 'E',"N", gridSquareArray);
		 Car car1 = new Car("E", gridSquareArray, 3, 20, gen);
		 gridSquareArray[3][0].setVehicle(car1);
		
		// Test 4.1: move into next GridSquare manually without deleting car from previous square
		// gridSquareArray[3][1].setVehicle(car1);
		
		// Test 4.2: move into next GridSquare and delete car from previous GridSquare
		// gridSquareArray[3][1].setVehicle(car1);
		// gridSquareArray[3][0].setHasVehicle(false);
		
		// Test 4.3: move across grid manually
		// for (int i = 0; i < gridSquareArray[0].length - 1; i++) {
		//	 gridSquareArray[3][i+1].setVehicle(car1);
		//	 gridSquareArray[3][i].setHasVehicle(false);
		// }
		
		// Test 4.4: call start method of car to see car move across grid automatically
		// Thread car = new Thread(car1);
		// car.start();
		 
		// Test 4.5 test car moving from North to South using by turning grid once
		 GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 1);
		 Car car2 = new Car("S", gridSquareArray2, 3, 20, gen);
		 Thread car = new Thread(car2);
		 car.start();
		
		// Test 4.6 test car moving from East to West using by turning grid twice
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 2);
		// Car car3 = new Car("W", gridSquareArray2, 3, 20, gen);
		// Thread car = new Thread(car3);
		// car.start();
		 
		// Test 4.7 test car moving from South to North using by turning grid three times 
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 3);
		// Car car4 = new Car("N", gridSquareArray2, 3, 20, gen);
		// Thread car = new Thread(car4);
		// car.start();
		
		// create GridDrawer object to draw the grid
		GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000); 
		//gridDrawer.writeGrid();
		Thread gd = new Thread(gridDrawer);
		gd.start();
		
		*/
		
/////////////////////////////////////////////////////////////////////////////
//Test 5: Test that only one car can occupy a GridSquare at a time
/////////////////////////////////////////////////////////////////////////////
//
		/*
		// create a grid of GridSquares, 10 by 20, for the tests
		GridSquare [][] gridSquareArray = GridMaker.generateGrid(10, 20);
				  
		// create a car and place it in a square on the grid, row 4, column 6
		VehicleGenerator gen = new VehicleGenerator(new VehicleFactory(), "Car", 'E',"N", gridSquareArray);
		Car car1 = new Car("X", gridSquareArray, 3, 20, gen);
		gridSquareArray[3][5].setVehicle(car1);
		
		// Test 5.1: test car moving from West to East cannot pass stationary car
		// Car car2 = new Car("E", gridSquareArray, 4, 20, gen);
		// Thread car = new Thread(car2);
		// car.start();
		
		// Test 5.2 test car moving from North to South cannot pass stationary Car
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 1);
		// Car car3 = new Car("S", gridSquareArray2, 15, 20, gen);
		// Thread car = new Thread(car3);
		// car.start();
		 
		// Test 5.3 test car moving from East to West cannot pass stationary Car
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 2);
	    // Car car3 = new Car("W", gridSquareArray2, 7, 20, gen);
		// Thread car = new Thread(car3);
	    // car.start();
	    
	    // Test 5.4 test car moving from South to North cannot pass stationary Car
	 	// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 3);
	 	// Car car4 = new Car("N", gridSquareArray2, 6, 20, gen);
	    // Thread car = new Thread(car4);
	 	// car.start();
		
		// Test 5.5 test car moving from West to East cannot pass car moving from East to West
		// Car car5 = new Car("E", gridSquareArray, 6, 20, gen);
		// Thread car = new Thread(car5);
		// car.start();
		 
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 2);
		// Car car6 = new Car("W", gridSquareArray2, 5, 20, gen);
		// Thread carE = new Thread(car6);
		// carE.start();
		
		// Test 5.6 test car moving from North to South cannot pass car moving from South to North
		// GridSquare [][] gridSquareArray2 = GridMaker.turnGridAntiClockwise(gridSquareArray, 1);
		// Car car7 = new Car("S", gridSquareArray2, 13, 20, gen);
		// Thread car = new Thread(car7);
		// car.start();
				 
		// GridSquare [][] gridSquareArray3 = GridMaker.turnGridAntiClockwise(gridSquareArray, 3);
		// Car car8 = new Car("N", gridSquareArray3, 8, 20, gen);
		// Thread carN = new Thread(car8);
		// carN.start();
		
		// create GridDrawer object to draw the grid
		GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000); 
		//gridDrawer.writeGrid();
		Thread gd = new Thread(gridDrawer);
		gd.start();
		
		*/
		
		
/////////////////////////////////////////////////////////////////////////////
//Test 6: Test VehicleGenerators create Cars as expected
/////////////////////////////////////////////////////////////////////////////
//
		
		
		// Test 6.1: test that East facing cars can be created for all rows by one VehicleGenerator
		// without specifying the row numbers
			// create a grid of GridSquares, 10 by 20
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
				
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.2: test that East facing cars can be created for all rows by one VehicleGenerator
		// by specifying all row numbers
			// create a grid of GridSquares, 10 by 20
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
				
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
			
			// specify all rows in an int array 
			// int[] allRows = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray, allRows);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
			
		// Test 6.3: test that East facing cars can be created for specific rows by one VehicleGenerator
		// by specifying the specific rows e.g. 1, 5, 10
			
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
			
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
			
			// specify all rows in an int array 
			// int[] allRows = {1, 5, 10};
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray, allRows);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.4: test that South facing cars can be created for all columns by one VehicleGenerator
		// without specifying the columns numbers
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
			
		// Test 6.5: test that South facing cars can be created for all columns by one VehicleGenerator
		// by specifying all column numbers
						
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
			
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
			
			// specify all columns in an int array 
			// int[] allColumns = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray, allColumns);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
			
		// Test 6.6: test that South facing cars can be created for specific columns by one VehicleGenerator
		// by specifying the specific columns e.g. 1, 7, 20
			
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
			
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
			
			// specify all columns in an int array 
			// int[] allColumns = {1,7,20};
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray, allColumns);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.7: test that West facing cars can be created for all rows by one VehicleGenerator
		// without specifying the row numbers
			
			// create a grid of GridSquares, 10 by 20
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
						
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.8: test that West facing cars can be created for all rows by one VehicleGenerator
		// by specifying all row numbers
			
			// create a grid of GridSquares, 10 by 20
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
						
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// specify all rows in an int array 
			// int[] allRows = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray, allRows);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.9: test that West facing cars can be created for specific rows by one VehicleGenerator
		// by specifying the specific rows e.g. 1, 3, 10
		
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// specify all rows in an int array 
			// int[] allRows = {1, 3, 10};
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray, allRows);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
				
		// Test 6.10: test that North facing cars can be created for all columns by one VehicleGenerator
		// without specifying the columns numbers
		
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
							
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
						
		// Test 6.11: test that North facing cars can be created for all columns by one VehicleGenerator
		// by specifying all column numbers
		
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// specify all columns in an int array 
			// int[] allColumns = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray, allColumns);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
						
		// Test 6.12: test that East facing cars can be created for specific columns by one VehicleGenerator
		// by specifying the specific columns e.g. 1, 7, 20
			
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
					
			// specify all columns in an int array 
			// int[] allColumns = {1,7,20};
					
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray, allColumns);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
		
		// Test 6.13: test that Generator calculates random speed (delay) of Car correctly when min and max are the same
			
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
		
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
							
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray);
			// set minSpeed and maxSpeed to 500
			// carGen1.changeSpeedRange(500, 500);
			// System.out.println("The speed value selected 1000 times. This should be 500 everytime: ");
			// for (int i = 0; i < 25; i++) {
				// for (int j = 0; j < 40; j++ ) {
				// System.out.print(carGen1.speed() + ",");
				// }
			// System.out.println();
			// }
		
		// Test 6.14: test that Generator calculates random speed (delay) of Car correctly within min and max range only
			
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
					
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
										
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray);
			// set minSpeed to 250 and maxSpeed to 300
			// carGen1.changeSpeedRange(250, 300);
			// create an ArrayList to add all generated speeds to
			// ArrayList<Integer> speeds = new ArrayList<Integer>();
			// System.out.println("The speed value selected 1000 times. This should be between 250 and 300 inclusive everytime: ");
			// for (int i = 0; i < 25; i++) {
				// for (int j = 0; j < 40; j++ ) {
					// int speed = carGen1.speed();
					// System.out.print(speed + ",");
					// speeds.add(speed);
				// }
				// System.out.println();
			// }
			// System.out.println("Max speed: " + Collections.max(speeds));
			// System.out.println("Min speed: " + Collections.min(speeds));
		
		// Test 6.15: test that Generator calculates random generation speed (delay) between Vehicle creation correctly when min and max are the same
		
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
				
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
									
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray);
			// set minGenerationSpeed and maxGenerationSpeed to 300
			// carGen1.changeSpeedRange(300, 300);
			// System.out.println("The speed value selected 1000 times. This should be 300 everytime: ");
			// for (int i = 0; i < 25; i++) {
				// for (int j = 0; j < 40; j++ ) {
					// System.out.print(carGen1.speed() + ",");
				// }
				// System.out.println();
			// }
		
		// Test 6.16: test that Generator calculates random generation speed (delay) between Vehicle creation correctly within min and max range only
		
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
							
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
												
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray);
			// set minSpeed to 333 and maxSpeed to 469
			// carGen1.changeSpeedRange(333, 469);
			// create an ArrayList to add all generated speeds to
			// ArrayList<Integer> speeds = new ArrayList<Integer>();
			// System.out.println("The speed value selected 1000 times. This should be between 333 and 469 inclusive everytime: ");
			// for (int i = 0; i < 25; i++) {
				// for (int j = 0; j < 40; j++ ) {
					// int speed = carGen1.speed();
					// System.out.print(speed + ",");
					// speeds.add(speed);
				// }
				// System.out.println();
			// }
			// System.out.println("Max speed: " + Collections.max(speeds));
			// System.out.println("Min speed: " + Collections.min(speeds));
		
		// create GridDrawer object to draw the grid
		// GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000); 
		//gridDrawer.writeGrid();
		// Thread gd = new Thread(gridDrawer);
		// gd.start();
	
	
/////////////////////////////////////////////////////////////////////////////
//Test 7: Test Statistics
/////////////////////////////////////////////////////////////////////////////
//
	
	
			
			// create a grid of GridSquares, 10 by 20
			// GridSquare[][] gridSquareArray = GridMaker.generateGrid(10, 20);		
					
			// create a VehicleFactory object to be used by VehicleGenerators to create Vehicles such as Car
			// VehicleFactory vehicleFactory = new VehicleFactory();
		
	// Test 7.1: test Statistics for cars travelling at same speed in same direction
			
			// create a VehicleGenerator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray, new int[] {1, 2});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen1.changeSpeedRange(200, 200);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
	
	// Test 7.2: test Statistics for cars travelling at varying speeds in same direction
			
			
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray, new int[] {1, 2});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen1.changeSpeedRange(100, 250);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
			
	// Test 7.3: test Statistics for cars travelling in different directions
			
			
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'S', "S", gridSquareArray, new int[] {1,2,3,4,5,6,7,8,9,10});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen1.changeSpeedRange(100, 250);
			// Thread cg1 = new Thread(carGen1);
			// cg1.start();
			
			// VehicleGenerator carGen2 = new VehicleGenerator(vehicleFactory, "Car", 'N', "N", gridSquareArray, new int[] {11,12,13,14,15,16,17,18,19,20});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen2.changeSpeedRange(100, 250);
			// Thread cg2 = new Thread(carGen2);
			// cg2.start();
			
			// VehicleGenerator carGen3 = new VehicleGenerator(vehicleFactory, "Car", 'E', "E", gridSquareArray, new int[] {1,2,3,4,5});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen1.changeSpeedRange(100, 250);
			// Thread cg3 = new Thread(carGen3);
			// cg3.start();
			
			// VehicleGenerator carGen4 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray, new int[] {6,7,8,9,10});
			// The 'speedRange' is set (Each Car will have a fixed delay from this range - a delay between a car entering a square and attempting to enter the next one)
			// carGen4.changeSpeedRange(100, 250);
			// Thread cg4 = new Thread(carGen4);
			// cg4.start();
			
			// create an array list of GeneratorStats to pass to a newly created Statistics object
			// The VehicleGenerators are added to the  array list - the generators implement the GeneratorStats interface
			// ArrayList<GeneratorStats> carGens = new ArrayList<GeneratorStats>();
			// carGens.add(carGen1);
			// carGens.add(carGen2);
			// carGens.add(carGen3);
			// carGens.add(carGen4);
			// Statistics stats = new Statistics(carGens);
			
	// Test 7.4: create dummy travelTime data and make sure Statistics calculated accurately		
	
			// Create a Vehicle Generator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray, new int[] {6,7,8,9,10});
			
			// create dummy travel data of 10x 2.0
			// ArrayList<Double> dummyTimes = new ArrayList<Double>();
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			// dummyTimes.add(2.0);
			
			// set times for generator
			// carGen1.setTravelTimes(dummyTimes);
			
			// create a Statistics object and write out calculated values
			// ArrayList<GeneratorStats> carGens = new ArrayList<GeneratorStats>();
			// carGens.add(carGen1);
			// Statistics stats = new Statistics(carGens);
			// System.out.println(stats.writeReport());
			
	// Test 7.5: create varied dummy travelTime data and make sure Statistics calculated accurately		
			
			// Create a Vehicle Generator
			// VehicleGenerator carGen1 = new VehicleGenerator(vehicleFactory, "Car", 'W', "W", gridSquareArray, new int[] {6,7,8,9,10});
					
			// create dummy travel data of 5x 1.5 and 5x 2.5
			// ArrayList<Double> dummyTimes = new ArrayList<Double>();
			// dummyTimes.add(1.5);
			// dummyTimes.add(1.5);
			// dummyTimes.add(1.5);
			// dummyTimes.add(1.5);
			// dummyTimes.add(1.5);
			// dummyTimes.add(2.5);
			// dummyTimes.add(2.5);
			// dummyTimes.add(2.5);
			// dummyTimes.add(2.5);
			// dummyTimes.add(2.5);
					
			// set times for generator
			// carGen1.setTravelTimes(dummyTimes);
				
			// create a Statistics object and write out calculated values
			// ArrayList<GeneratorStats> carGens = new ArrayList<GeneratorStats>();
			// carGens.add(carGen1);
			// Statistics stats = new Statistics(carGens);
			// System.out.println(stats.writeReport());
			
			// create GridDrawer object to draw the grid
			// GridDrawer gridDrawer = new GridDrawer(gridSquareArray, 2000, stats); 
			// gridDrawer.writeGrid();
			// Thread gd = new Thread(gridDrawer);
			// gd.start();
	
	
	
	}
	
}
