package proba;

import java.awt.Color;
import harmadik.Szinespont;
import harmadik.Toll;
import sajat.ISzinezheto;

public class TesztProba {

	
	public static void main(String[] args) {
		ISzinezheto szinespont = new Szinespont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		
		ISzinezheto toll =  new Toll("toll","Parker",2000 , Color.CYAN);
		
		System.out.println(toll.toString());
		toll.setSzin(Color.ORANGE);
		System.out.println(toll);
		((Toll)toll).markaEgyenlo((Toll)toll);
		
	}
	public static void setSzin(ISzinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezettSzin);
	} 

}