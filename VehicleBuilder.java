// interface which specifies buildVehicle method (which must actually be implemented by VehicleFactory)

public interface VehicleBuilder {
	 
	public Vehicle buildVehicle(String vehicleName, String symbol, GridSquare[][] gridSquareArray, int startRow, int speed, GeneratorDetails gen);
}
