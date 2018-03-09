package converter;

/**
 * set the value of length by unit
 * @author Hayato Kawai
 *
 */
public enum Length {

	Mile(1609.344), Kilometer(1000.0), Meter(1.0), Centimeter (0.01),Foot(0.3048),Wa(2.0), Au(149597870700.00);

	private final double value;

	private Length(double value) {
		this.value = value;
	}

	/**
	 * return the value
	 * @return
	 */
	public double getValue() {
		return this.value;
	}
}
