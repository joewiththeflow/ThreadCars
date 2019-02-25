import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// class used to create objects representing squares which could be used in a grid
// objects of this type can hold one Vehicle or no Vehicle at a time
// uses ReentrantLock and condition to help ensure this
public class GridSquare {
	
	// private instance variables
	private boolean hasVehicle;
	private Vehicle vehicle; // an indicator as to whether GridSquare currently has a Vehicle inside it or not
	private ReentrantLock counterLock = new ReentrantLock();
	private Condition squareEmpty = counterLock.newCondition();
	
	// constructor to create empty GridSquare
	public GridSquare() {
		vehicle = null;
		hasVehicle = false;
	}
	
	// return the symbol representing the Vehicle object if there is one, empty string otherwise to say square is empty
	public String toString() {
		
		if(hasVehicle) {
			return vehicle.getSymbol();
		}
		else
			return " ";
	}
	
	// return a boolean value of true if this GridSquare currently has a Vehicle inside it, false otherwise
	public boolean getHasVehicle() {
		return this.hasVehicle;
	}
	
	// method to set hasVehicle variable of GridSquare to true or false
	public void setHasVehicle(boolean hasVehicle) {
		counterLock.lock();
		try {
			this.hasVehicle = hasVehicle;
			// alert any waiting Vehicles
			squareEmpty.signalAll();
		} finally {
			counterLock.unlock();
		}
		
	}
	
	// method which returns Vehicle in GridSquare
	// returns null if no Vehicle in GridSquare
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	// method used to place a Vehicle inside GridSquare
	public void setVehicle(Vehicle vehicle) {
		counterLock.lock();
		try {
			while(hasVehicle) {
				squareEmpty.await();
			}
			// when we get to here, the GridSquare currently has no Vehicle
			this.vehicle = vehicle;
			this.hasVehicle = true;
		} catch (InterruptedException e) {
			
		}finally {
			counterLock.unlock();
		}
		
	}
}
