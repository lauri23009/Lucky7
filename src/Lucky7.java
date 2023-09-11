
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
		
		System.out.println(määrä);
		saldo = Integer.parseInt(in.nextLine());	
	
		
		do {
			
		//Arvo 3 numeroa väliltä 1-10	
		randomNumber1 = random.nextInt(11); 
		randomNumber2 = random.nextInt(11); 
		randomNumber3 = random.nextInt(11);
		
		//Aloitus saldo
		
		
		System.out.println("Saldo: " + saldo + "€ \r\n");
		
		if (saldo <= 0) {
			System.out.println("Peli päättyi");
			break;
		}
		
		//"Pelataanko" vaihtoehto
		System.out.println(pelata);
		pelaa = in.nextLine();
		

		
		if (pelaa.equals("Kyllä")) {
			saldo -=1;
			System.out.println("Numero 1 = " + randomNumber1);
			System.out.println("Numero 2 = " + randomNumber2);
			System.out.println("Numero 3 = " + randomNumber3);
			
			//Lopputulokset "Voitit!, Hävisit!"
			
			if (randomNumber1 == 7 && randomNumber2 == 7 && randomNumber3 == 7){
				saldo +=20;
				System.out.println("\r\nJackpot!!!\r\n"
									+ "Voitit 20€! \r\n");
			}
			else if (randomNumber1 == 7 && randomNumber2 == 7){
				saldo +=8;
				System.out.println("Voitit 8€! \r\n");
			}
			else if (randomNumber2 == 7 && randomNumber3 == 7){
				saldo +=8;
				System.out.println("Voitit 8€! \r\n");
			}
			else if (randomNumber1 == 7 && randomNumber3 == 7){
				saldo +=8;
				System.out.println("Voitit 8€! \r\n");
			}
			else if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7){
				saldo +=3;
				System.out.println("Voitit 3€! \r\n");
			}
			else {
				System.out.println("Hävisit! \r\n");
			}
			}
			else if (pelaa.equals("Ei")){
				System.out.println("Peli päättyi");
			}
			else {
				System.out.println("Error!");
			}
			
			}while (pelaa.equals("Kyllä"));
		
		
		
	}
		
}


