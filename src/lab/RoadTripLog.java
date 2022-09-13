package lab;

public class RoadTripLog {

	
	//instance
	private String name;
	private double distance;
	private double fuel;
	private double mpg;
	
	
	//constructor
	public RoadTripLog(String name) {
		this.name = name;
		distance = 0;
		fuel = 0;
		mpg = 0;
	}
	
	//getters
	public double getTotalDistance() {
		return distance;
	}
	
	public double getTotalFuel() {
		return fuel;
	}
	
	public double getMPG() {
		mpg = Math.round((distance/fuel) * 10.0) / 10.0;
		return mpg;
	}
	
	
	//setters
	public void addDistance(double add) {
		distance += add;
	}
	public void addFuel(double add) {
		fuel += add;
	}
	
	//toString() override
	@Override
	public String toString() {
		return "Trip: " + name
			+ "\n   Distance: " + distance
			+ "\n   Fuel: " + fuel
			+ "\n   MPG: " + getMPG();
	}
		

}
