import java.util.Random;


public class veletlenszam {


	public static void main(String[] args) {
		int[] tomb = new int [10];
		Random veletlenszam = new Random();
		for (int i = 0; i < tomb.length; i++) {
			tomb [i] =veletlenszam.nextInt(50) + 1;
			System.out.println(tomb[i]);
		}
		
		for (int i = tomb.length - 1 ;i >= 0; i--) {
			System.out.println(tomb[i]);
			
		}
		//legnagyobb paros szam megkeresese
		int legnagyobbindex = -1;
		for (int i = 0; i < tomb.length; i++) {
			if(tomb[i] % 2 == 0){
				if (legnagyobbindex == -1);
					legnagyobbindex = i;
			} else {
				if (tomb[legnagyobbindex] < tomb[i]){
					legnagyobbindex = i;
				}
			}
			
		}
		

}
