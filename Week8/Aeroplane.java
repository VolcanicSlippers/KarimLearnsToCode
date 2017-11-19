/**
 * Aeroplane is a sub-class that extends Aircraft and gives the range that the
 * aeroplane may travel whilst inheriting the other parameters from the Aircraft
 * class.
 * 
 * 
 * @author Karim
 *@version 19/11/2017
 */

public class Aeroplane extends Aircraft {

	private double range;

	public Aeroplane(double maxSpeed, double maxWeight, int maxPerson, double range) {
		super(maxSpeed, maxWeight, maxPerson);
		this.range = range;
	}

	/**
	 * getter method for the range.
	 * 
	 * @return The range of travel that the aeroplane can undertake.
	 */
	public double getRange() {
		return range;
	}

	/**
	 * setter method for range.
	 * 
	 * @param range
	 *            the new range of the aeroplane.
	 */
	public void setRange(double range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return super.toString() + " It has a range of " + range + " km.";
	}

}
