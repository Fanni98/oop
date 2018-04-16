package sajat;

public class Teglatest extends Hasab {

		private double a;
		private double b;
		
		
	public Teglatest(double magassag, double a, double b) {
			super(magassag);
			this.a = a;
			this.b = b;
		}


	@Override
	public double getAlapterulet() {
		return a * b;
	}


	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ",Magassag()="
				+ getMagassag() + "]";
	}
	
	

}
