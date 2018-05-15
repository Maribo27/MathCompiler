package by.maribo.compiler.type;

public class Float {
	private float floatNumber;

	public Float(float floatNumber) {
		this.floatNumber = floatNumber;
	}

	public float getFloatNumber() {
		return floatNumber;
	}

	public void setFloatNumber(float floatNumber) {
		this.floatNumber = floatNumber;
	}

	@Override
	public String toString() {
		return String.valueOf(floatNumber);
	}
}