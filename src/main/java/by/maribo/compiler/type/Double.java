package by.maribo.compiler.type;

public class Double {
	private double doubleNumber;

	public Double(double doubleNumber) {
		this.doubleNumber = doubleNumber;
	}

	public double getDoubleNumber() {
		return doubleNumber;
	}

	public void setDoubleNumber(double doubleNumber) {
		this.doubleNumber = doubleNumber;
	}

	@Override
	public String toString() {
		return String.valueOf(doubleNumber);
	}
}