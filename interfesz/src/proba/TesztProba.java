package proba;

import java.awt.Color;
import harmadik.Szinespont;
import sajat.ISzinezheto;

public class TesztProba {

	
	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		

	}
	public static void setSzin(ISzinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezettSzin);
	}

}