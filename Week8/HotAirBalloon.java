/**
 * The subclass HotAirBalloon extends the class Aircraft and gives the
 * gasTemperature of the aircraft, whilst inheriting the parameters from
 * Aircraft.
 * 
 * @author Karim
 * @version 19/11/2017
 *
 */
public class HotAirBalloon extends Aircraft {

	private double gasTemperature;

	/**
	 * Constructor for HotAirBalloon
	 * 
	 * @param maxSpeed
	 *            the Maximal speed of the Hot air balloon.
	 * @param maxWeight the Maximal weight of the Hot air balloon.
	 * @param maxPerson the Maximal person(s) allowed on the Hot air balloon.
	 */
	public HotAirBalloon(double maxSpeed, double maxWeight, int maxPerson, double gasTemperature) {
		super(maxSpeed, maxWeight, maxPerson);

		this.gasTemperature = gasTemperature;
	}

	/**
	 * getter method for gasTemperature
	 * 
	 * @return The gas temperature of the Hot air balloon.
	 */

	public double getGasTemperature() {
		return this.gasTemperature;
	}

	/**
	 * setter method for getTemperature
	 * 
	 * @param gasTemperature
	 *            the new value of the gas temperature of the hot air balloon.
	 */
	public void setGasTemperature(double gasTemperature) {
		this.gasTemperature = gasTemperature;
	}

	@Override
	public String toString() {
		return super.toString() + " It has a gas temperature of maximally " + gasTemperature + "°C.";
	}
}
