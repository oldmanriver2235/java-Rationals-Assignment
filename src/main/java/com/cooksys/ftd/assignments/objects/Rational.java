package com.cooksys.ftd.assignments.objects;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Rational implements IRational {
	private int denominator;
	private int numerator;

	/**
	 * Constructor for rational values of the type:
	 * <p>
	 * `numerator / denominator`
	 * <p>
	 * No simplification of the numerator/denominator pair should occur in this
	 * method.
	 *
	 * @param numerator   the numerator of the rational value
	 * @param denominator the denominator of the rational value
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	public Rational(int numerator, int denominator) throws IllegalArgumentException {
		// throw new NotImplementedException();

		if (denominator == 0) {
			throw new IllegalArgumentException("Try again");
		}
		/*
		 * int div = numerator == 0 ? 1 : getGCD(numerator, denominator); this.numer =
		 * numerator/ div; this.denom = numerator == 0 ? 1 : denominator/ div;
		 */
		this.numerator = numerator;
		this.denominator = denominator;

	}
//    public Rational(Rational other) {
//    	this(other.numer, other.denom);
	// }

	/**
	 * @return the numerator of this rational number
	 */

	public int getNumerator() {
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
	 * @return the constructed rational value
	 * @throws IllegalArgumentException if the given denominator is 0
	 */
	public Rational construct(int numerator, int denominator) throws IllegalArgumentException {
		// throw new NotImplementedException();

		if (denominator == 0) {
			throw new IllegalArgumentException("Whoops");
		} else {
			return new Rational(numerator, denominator);
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
		}else {
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
			return Math.abs (numerator) + "/" + Math.abs(denominator);
		}else {
			return "-" + (Math.abs(numerator) + "/" + Math.abs(denominator));
		}
	}
}
