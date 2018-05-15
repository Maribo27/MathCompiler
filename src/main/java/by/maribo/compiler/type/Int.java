package by.maribo.compiler.type;

public class Int {
	private int intNumber;

	public Int(int intNumber) {
		this.intNumber = intNumber;
	}

	public int getIntNumber() {
		return intNumber;
	}

	public void setIntNumber(int intNumber) {
		this.intNumber = intNumber;
	}

	@Override
	public String toString() {
		return String.valueOf(intNumber);
	}
}