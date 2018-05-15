public class Program {
	public static void main(String[] args) {
		try {
			new Program().start();
		} catch (CompilerException e) {
			System.err.println(e.getMessage());
		}
	}

	private void start() {
		System.out.println("prog5");
		int l = 1;
		int m = 89;
		double n = -2.5;
		int p = -4;
		System.out.println(l + m);
		System.out.println(p);
		p = 89 ^ 1;
		System.out.println(p);
		System.out.println(Math.pow(p, n));
	}


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

	public class Float {
		private float floatNumber;

		public Float(float floatNumber) {
			this.floatNumber = floatNumber;
		}

		public float getDoubleNumber() {
			return floatNumber;
		}

		public void setDoubleNumber(float floatNumber) {
			this.floatNumber = floatNumber;
		}

		@Override
		public String toString() {
			return String.valueOf(floatNumber);
		}
	}

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

	public class CompilerException extends RuntimeException {
		public CompilerException(String message) {
			super(message);
		}
	}
}