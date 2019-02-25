// A VehicleFactory class which implements the VehicleBuilder interface
// This class should be used to create different varieties of Vehicles

public class VehicleFactory implements VehicleBuilder{
	
	//default constructor
	public VehicleFactory() {
		
	}
	
	// method called to create particular Vehicle based upon vehicleName
	public Vehicle buildVehicle(String vehicleName, String symbol, GridSquare[][] gridSquareArray, int startRow, int speed, GeneratorDetails gen) {
		if(vehicleName.equals("Car")) {
			return new Car(symbol, gridSquareArray, startRow, speed, gen);
		}
		else
			return null;
	}
}
