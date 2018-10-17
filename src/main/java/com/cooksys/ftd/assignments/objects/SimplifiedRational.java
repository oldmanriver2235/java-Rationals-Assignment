package com.cooksys.ftd.assignments.objects;

public class SimplifiedRational implements IRational {
	private int denominator;
	private int numerator;

	/**
	 * Determines the greatest common denominator for the given values
	 *
	 * @param a the first value to consider
	 * @param b the second value to consider
	 * @return the greatest common denominator, or shared factor, of `a` and `b`
	 * @throws IllegalArgumentException if a <= 0 or b < 0
	 */
	public static int gcd(int a, int b) throws IllegalArgumentException {
		// throw new NotImplementedException();
		if (a <= 0 || b < 0) {
			throw new IllegalArgumentException("wrong again.");
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	/**
	 * Simplifies the numerator and denominator of a rational value.
	 * <p>
	 * For example: `simplify(10, 100) = [1, 10]` or: `simplify(0, 10) = [0, 1]`
	 *
	 * @param numerator   the numerator of the rational value to simplify
	 * @param denominator the denominator of the rational value to simplify
	 * @return a two element array representation of the simplified numerator and
	 *         denominator
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	public static int[] simplify(int numerator, int denominator) throws IllegalArgumentException {
		// throw new NotImplementedException();
		if (denominator == 0) {
			throw new IllegalArgumentException("YOOOOUUUUUU shall not PAAAAAASSSSSS!!!!!!");
		
		
		}
		
		int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

		int newNumerator = (numerator / gcd);
		int newDenominator = (denominator / gcd);

		int[] newArray = new int[2];
		newArray[0] = newNumerator;
		newArray[1] = newDenominator;

		return newArray;
	
	}

	/**
	 * Constructor for rational values of the type:
	 * <p>
	 * `numerator / denominator`
	 * <p>
	 * Simplification of numerator/denominator pair should occur in this method. If
	 * the numerator is zero, no further simplification can be performed
	 *
	 * @param numerator   the numerator of the rational value
	 * @param denominator the denominator of the rational value
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	public SimplifiedRational(int numerator, int denominator) throws IllegalArgumentException {
		// throw new NotImplementedException();
		if (denominator == 0) {
			throw new IllegalArgumentException("Turn back now");
		}
		
		if (numerator == 0) {
			this.numerator = numerator;
			this.denominator = denominator;
		}else {
		
	    int [] simpRat= simplify(numerator, denominator);
	    this.numerator = simpRat[0];
	    this.denominator = simpRat[1];
	}
	}
	/**
	 * @return the numerator of this rational number
	 */
	public int getNumerator() {
		// throw new NotImplementedException();
		return this.numerator;
	}

	/**
	 * @return the denominator of this rational number
	 */
	public int getDenominator() {
		// throw new NotImplementedException();
		return this.denominator;
	}

	/**
	 * Specializable constructor to take advantage of shared code between Rational
	 * and SimplifiedRational
	 * <p>
	 * Essentially, this method allows us to implement most of IRational methods
	 * directly in the interface while preserving the underlying type
	 *
	 * @param numerator   the numerator of the rational value to construct
	 * @param denominator the denominator of the rational value to construct
	 * @return the constructed rational value (specifically, a SimplifiedRational
	 *         value)
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	public SimplifiedRational construct(int numerator, int denominator) throws IllegalArgumentException {
		// throw new NotImplementedException();
		if (denominator == 0) {
			throw new IllegalArgumentException("This way lies trouble");
		} else {
			return new SimplifiedRational(numerator, denominator);
		}
	}

	/**
	 * @param obj the object to check this against for equality
	 * @return true if the given obj is a rational value and its numerator and
	 *         denominator are equal to this rational value's numerator and
	 *         denominator, false otherwise
	 */
	public boolean equals(Object obj) {
		// throw new NotImplementedException();
		if (obj instanceof IRational) {
			if (this.getNumerator() == ((IRational) obj).getNumerator()
					&& this.getDenominator() == ((IRational) obj).getDenominator()) {
				return true;

			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * If this is positive, the string should be of the form `numerator/denominator`
	 * <p>
	 * If this is negative, the string should be of the form
	 * `-numerator/denominator`
	 *
	 * @return a string representation of this rational value
	 */
	public String toString() {
		// throw new NotImplementedException();
		if (numerator > 0 == denominator > 0) {
			return Math.abs(numerator) + "/" + Math.abs(denominator);
		} else {
			return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);
		}
	}
}
