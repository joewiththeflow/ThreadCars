// An interface used by generated objects to refer to the generator which created them
// Allows generated object to only access methods of generator which may actually be required
// e.g. addTimeTaken method

public interface GeneratorDetails {
	public void addTimeTaken(double timeTaken);
}
