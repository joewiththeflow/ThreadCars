import java.util.ArrayList;
import java.util.Collections;
// A class used to help produce Statistics based on Generator data
// Uses the GeneratorStats interface so as to only access required methods of Generator

public class Statistics {
	
	//private instance variables
	private ArrayList<GeneratorStats> generatorList; //list of all generators using interface
	
	//constructor for Statistics object which requires:
	// - an ArrayList<GeneratorStats> objects which represent the generators
	public Statistics(ArrayList<GeneratorStats> carGen) {
		this.generatorList = carGen;
	}
	
	// return a double which represents the average travel time
	private double getAvg(ArrayList<Double> travelTimes) {
		double sum = 0;
		for(int i = 0; i < travelTimes.size(); i++) {
			sum += travelTimes.get(i);
		}
		return sum / travelTimes.size();
	}
	
	// return a double which represents the variance of travel times
	// The below method calculates the population variance
	private double getVariance(ArrayList<Double> travelTimes, double average) {
		double tempSum = 0.0;
		for(Double time : travelTimes) {
			tempSum += ((time - average) * (time - average));
		}
		// final variance calculation
		double variance = tempSum / travelTimes.size();
		
		return variance;
	}
	
	//write a report, including generator name, average time, min and max time and variance
	public String writeReport() {
		
		String report = String.format("%-24s %12s %12s %12s %12s %n", "Generator Name", "Avg Time(s)", "Min Time(s)", "Max Time(s)", "Variance" );
		for(GeneratorStats gen : generatorList) {
			ArrayList<Double> travelTimes = gen.getTravelTimes();
			double average = getAvg(travelTimes);
			report += String.format("%-20s %12.2f %12.2f %12.2f %12.2f %n", gen.getName(), average, 
					Collections.min(travelTimes), Collections.max(travelTimes), getVariance(travelTimes, average));
		}
		return report;
	}
}
