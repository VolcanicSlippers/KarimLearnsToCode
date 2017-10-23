/** Distance is a public class that allows us to deal with distances given in Kilometres and can convert them to metres, miles and yards.
 * @author KarimLearnsToCode
 */


public class Distance {
	private double km;
	
	public static final double KilometrePerMile = 1.60934;
	public static final double MetrePerKilometre = 1000;
	public static final double YardsPerKilometre = 1760/ 1.60934;
	
	/*
	 * @param kilograms The total weight given in pounds.
	 */
	public  Distance (double km) {
		this.km = km; 
	}
	
	/*
	 * @return The distance in Miles.
	 */
	public double getMiles() {
		return ( this.km / KilometrePerMile ); // 1 mile is = 1.60934 km, so we must times the km value by the miles per km.
	}
	
	/*
	 * @return The distance in Kilometres.
	 */
	public double getKilometres() {
		return this.km; //if we have km already, then the output should be identical.
	}
	
	/*
	 * @return The distance in Metres.
	 */
	public double getMetres() {
		return ( this.km *  MetrePerKilometre ); // since 1km is = 1000 metres, we must multiply the km value
	}
	
	/*
	 * @return The distance in Yards.
	 */
	public double getYards() {
		return ( this.km * YardsPerKilometre );
	}
	
	/*
	 * @return A string displaying the distance converted from kilometres, into 
	 * Metres, Miles and Yards.
	 */
	public String printDistance() {
        return ( "A distance of " + getKilometres() + " km corresponds to "
            + getMetres() + " Metres, " + getMiles() + " Miles and " + getYards() + "Yards.");
    } 
	
	/*
	 * Main method for some initial tests.
	 */
public static void main (String[] args) {
	Distance d1 = new Distance (5.3);
	Distance d2 = new Distance (2.76);
	
	
	System.out.println(d1.printDistance());
	System.out.println(d2.printDistance());
}
}
