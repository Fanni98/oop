package harmadik;

import java.awt.Color;

import sajat.ISzinezheto;

public class Toll extends Aru implements ISzinezheto {

	private Color szin;
	private String markanev;

	public Toll(String nev, String markanev, int ar, Color szin) {
		super(nev, ar);
		this.szin = szin;
		this.markanev = markanev;
	}

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Toll [szin=" + szin + ", markanev=" + markanev
				+ ", toString()=" + super.toString() + "]";
	}
	
	public boolean markaEgyenlo(Toll masikToll) {
		return markanev.equals(masikToll.markanev);
		
	}

}
