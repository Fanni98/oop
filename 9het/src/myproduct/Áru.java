package myproduct;

public class Áru {
	private String nev;
	private int nettoar;
	private int afa;
	
	public Áru(String nev, int ar, int afa) {
		this.nev = nev;
		this.nettoar = ar;
		this.afa = afa;
	}

	public int bruttoAr() {
		return (int)(nettoar * (1 + afa /100.0));
		
	}
	@Override
	public String toString() {
		return "Áru neve" + nev + ", brutto ára=" + bruttoAr();
	}
	
	public void netto_arat_novel(int szazalek) {
		nettoar= (int)(nettoar * (1+ afa / 100.0));
	}
	
	public int osszeHasonlitas(Áru masik_aru) {
		if (bruttoAr() > masik_aru.bruttoAr()){
			return 1;
		}
		else if (bruttoAr()<masik_aru.bruttoAr()){
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
