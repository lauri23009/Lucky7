
import java.util.Scanner;
import java.util.Random;

public class Lucky7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		//Muuttujat
		int randomNumber1;
		int randomNumber2;
		int randomNumber3;
		int saldo;
		String määrä = "Millä summalla pelaat: ";
		String pelata = "Pelataanko? (Kyllä, Ei)";
		String pelaa;
		
		
		//Arvo 3 numeroa väliltä 1-10
		randomNumber1 = random.nextInt(11);		
		randomNumber2 = random.nextInt(11);	
		randomNumber3 = random.nextInt(11);	
		
		System.out.println(määrä);
		saldo = Integer.parseInt(in.nextLine());	
	
		
		do {
		//Aloitus saldo
		System.out.println("Saldo: " + saldo + "€ \r\n");
		
		//"Pelataanko" vaihtoehto
		System.out.println(pelata);
		pelaa = in.nextLine();
		
		
		if (pelaa.equals("Ei")){
			System.out.println("Peli päättyi");
		}
		
		else if (pelaa.equals("Kyllä")) {
	
			System.out.println("Numero 1 = " + randomNumber1);
			System.out.println("Numero 2 = " + randomNumber2);
			System.out.println("Numero 3 = " + randomNumber3);
		
			
			
			
			//Lopputulokset "Voitit!, Hävisit!"
			if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
				System.out.println("Voitit! \r\n");
			}
			else {
				System.out.println("Hävisit! \r\n");
			}
			}
			else {
				System.out.println("Error!");
			}
			
		
			}while (pelaa.equals("Kyllä"));
		
		
		
		
	
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}


