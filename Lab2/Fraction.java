
public class Fraction {
	int numerator;
	int denominator;

	// Single argument constructor to set the numerator with default denominator of
	// 1
	public Fraction(int numerator) {
		this.numerator = numerator;
		denominator = 1;
	}

	// Dual argument constructor
	public Fraction(int numerator, int denominator) {
		int divisor = gcd(numerator, denominator); // determine the GCD of both integers
		this.numerator = numerator / divisor; // use the gcd to reduce numerator
		this.denominator = denominator / divisor; // use the gcd to reduce the denominator
	}

	public Fraction add(Fraction right) {
		Fraction temp = new Fraction(0);

		// if the denominators are the same just add the numerators
		if (this.denominator == right.denominator) {
			temp.denominator = this.denominator;
			temp.numerator = this.numerator + right.numerator;
			return temp;
		} else {
			temp.denominator = this.denominator * right.denominator;
			temp.numerator = (this.numerator * right.denominator) + (right.numerator * this.denominator);
			int divisor = gcd(temp.numerator, temp.denominator);
			temp.numerator = temp.numerator / divisor;
			temp.denominator = temp.denominator / divisor;
			return temp;
		}
	}

	public Fraction sub(Fraction right) {
		Fraction temp = new Fraction(0);

		// if the denominators are the same just add the numerators
		if (this.denominator == right.denominator) {
			temp.denominator = this.denominator;
			temp.numerator = this.numerator - right.numerator;
			return temp;
		} else {
			temp.denominator = this.denominator * right.denominator;
			temp.numerator = (this.numerator * right.denominator) - (right.numerator * this.denominator);
			int divisor = gcd(temp.numerator, temp.denominator);
			temp.numerator = temp.numerator / divisor;
			temp.denominator = temp.denominator / divisor;
			return temp;
		}
	}

	public Fraction mult(Fraction right) {
		Fraction temp = new Fraction(0);
		temp.numerator = this.numerator * right.numerator;
		temp.denominator = this.denominator * right.denominator;
		int divisor = gcd(temp.numerator, temp.denominator);
		temp.numerator = temp.numerator / divisor;
		temp.denominator = temp.denominator / divisor;
		return temp;
	}

	public Fraction div(Fraction right) {
		Fraction temp = new Fraction(0);
		temp.numerator = this.numerator * right.denominator;
		temp.denominator = this.denominator * right.numerator;
		int divisor = gcd(temp.numerator, temp.denominator);
		temp.numerator = temp.numerator / divisor;
		temp.denominator = temp.denominator / divisor;
		return temp;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public boolean equals(Object otherObject) { // step 1
		if (this == otherObject) { // step 2
			return true;
		}

		if (otherObject == null) { // step 3
			return false;
		}

		if (getClass() != otherObject.getClass()) { // step 4.a
			return false;
		}

		Fraction other = (Fraction) otherObject; // step 5

		// step 6
		return numerator == other.numerator && denominator == other.denominator;
	}

	// Euclid's Algorithm for finding the greatest common divisor
	private int gcd(int u, int v) {
		u = (u < 0) ? -u : u; // make u non-negative
		v = (v < 0) ? -v : v; // make v non-negative
		while (u > 0) {
			if (u < v) {
				int t = u; // swap u and v
				u = v;
				v = t;
			}
			u -= v;
		}
		return v; // the GCD of u and v
	}

}
