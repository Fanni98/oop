package myproduct;

public class Kenyer extends Áru {
	private double mennyiseg;

	public Kenyer(String nev, int ar, int afa, double mennyiseg) {
		super(nev, ar, afa);
		this.mennyiseg = mennyiseg;
	}

	@Override
	public String toString() {
		return "Kenyer" + super.toString() 
				+"egysegar:"
				+ bruttoAr()/mennyiseg
				+ "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}
	public static boolean elso_kenyer_nagyobb_egysegaru (Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		return elso_kenyer.bruttoAr() / elso_kenyer.mennyiseg >
		masodik_kenyer.bruttoAr() / masodik_kenyer.mennyiseg;
		
	}
	

	
	


}
