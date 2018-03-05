
public class AlkHaszn {
	public static void main(String[] args) {
		Alkalmazott alkalmazott = new Alkalmazott();
		//alkalmazott. nev = "Kiss József";
		//alkalmazott.fizetes= 10;
		alkalmazott.setNev("Kiss József"); 
		//System.out.println(alkalmazott.toString());
		//alkalmazott.fizetesNovel(5);
		alkalmazott.setFizetes(20);  
		System.out.println(alkalmazott.toString());
		System.out.println(alkalmazott.fizetesIntervallumokKozott(10, 50));
		System.out.println(alkalmazott.fizetendoAdo() );
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setFizetes(80);
		alkalmazott2.setNev("Kiss Klaudia");
		
		System.out .println(alkalmazott.nagyobbfizetesuMint(alkalmazott2) );
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott ();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes ((long)(Math.random()*50)) ;
			System.out.println(alkalmazottak[i]);
		}
		    
	}
}
  