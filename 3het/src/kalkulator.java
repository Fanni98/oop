import java.util.Scanner;


public class kalkulator {

	
	public static void main(String[] args) {
		
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Kerem az elso operandus erteket!");
		System.out.println("elso operandus:");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("Kerem az masodik operandus erteket!");
		System.out.println("masodik operandus:");
		double masodik_operandus = bemenet.nextDouble();
				
		System.out.println("Kerem az operatort!");
		System.out.println("operator:");
		String operator = bemenet.nextLine();
		/*
		switch (operator) {
		case "+":
			System.out.println("eredmeny:" + (elso_operandus + masodik_operandus));
			break;
		case "-":
			System.out.println("eredmeny:" + (elso_operandus - masodik_operandus));
			break;
		case "/":
			System.out.println("eredmeny:" + (elso_operandus / masodik_operandus));
			break;
		case "*":
			System.out.println("eredmeny:" + (elso_operandus * masodik_operandus));
			break;
		default :
				
		} 
		
		*/
		System.out.println("az eredmeny:");
		
		System.out.println("Kerem adja meg a kiszamitando kifejezest!");
		System.out.println("kifejezes:");
		String kifejezes = bemenet.nextLine();
		
		String[] tomb = kifejezes.split(" ");
		elso_operandus = Double.parseDouble(tomb[0]);
		masodik_operandus = Double.parseDouble(tomb[2]);
		operator = tomb[1];
		
		System.out.println(tomb[0]);
		System.out.println(tomb[1]);
		System.out.println(tomb[2]);
		
		
		bemenet.close();
	}
	

}
