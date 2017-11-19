/**
 * Aircraft is a class that notes an aircraft's Maximal speed, its maximal
 * weight and the maximum number of people it can carry.
 * 
 * @author Karim
 * @version 19/11/2017
 *
 */
public class Aircraft {
	/**
	 * These are the field variables.
	 */
	private double maxSpeed;
	private double maxWeight;
	private int maxPersons;

	/**
	 * @param maxSpeed
	 *            tells us the maximal speed of the Aircraft.
	 * @param maxWeight
	 *            tells us the maximum weight.
	 * @param maxPersons
	 *            tells us the maximum number of people the aircraft can carry.
	 */
	public Aircraft(double maxSpeed, double maxWeight, int maxPersons) {

		this.maxSpeed = maxSpeed;
		this.maxWeight = maxWeight;
		this.maxPersons = maxPersons;

	}

	/**
	 * getter method to return the maximal Speed of the Aircraft.
	 * 
	 * @return The maximal speed of the aircraft.
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * getter method to return the maximal weight of the Aircraft..
	 * 
	 * @return The maximum weight of the Aircraft.
	 */
	public double getMaxWeight() {
		return maxWeight;
	}

	/**
	 * getter method to return the maximum number of people allowed on aircraft.
	 * 
	 * @return The maximum number of people allowed in the aircraft.
	 */
	public int getMaxPersons() {
		return maxPersons;
	}

	/**
	 * setter method to change the max speed.
	 * 
	 * @param maxSpeed
	 *            The new maximum speed of the aircraft.
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * setter method to change the max weight.
	 * 
	 * @param maxWeight
	 *            The new maximum weight.
	 */
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	/**
	 * setter method to change the max number of people .
	 * 
	 * @param maxSpeed
	 *            The new maximal number of people allowed on the aircraft.
	 */
	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}

	/**
	 * toString method of aircraft information
	 * 
	 * @return The aircraft displayed as specified.
	 */
	public String toString() {
		if (maxPersons == 1) {
			return "The aircraft has a maximal speed of " + maxSpeed + " km/h " + "and a maximal weight of " + maxWeight
					+ " kg." + " It can carry " + maxPersons + " person.";
		}

		/*
		 * throw an exception if maxPersons is negative.
		 */
		else if (maxPersons < 0) {

			throw new IllegalArgumentException();
		}

		else {
			return "The aircraft has a maximal speed of " + maxSpeed + " km/h " + "and a maximal weight of " + maxWeight
					+ " kg." + " It can carry " + maxPersons + " persons.";

		}
	}

	public static void main(String[] args) {
		try {
			// Aircraft john = new Aircraft(200, 1000, 99 );
			HotAirBalloon yay = new HotAirBalloon(200, 1000, -1, 22);
			Aeroplane nay = new Aeroplane(10000, 999999, 300, 5000);

			// System.out.println(john);
			System.out.println(yay);
			System.out.println(nay);
		} catch (IllegalArgumentException a) {
			System.out.println("Error. Invalid number of Person(s).");

		}
	}
}
